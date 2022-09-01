import java.util.Scanner;

/*
* 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
* */
public class topic_3 {
    public int lengthOfLongestSubstring(String s){
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }

        int n = s.length();//s的长度

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

    public int method2(String s){
        int len = s.length();
        if (len == 0)return 0;
        int flag1 = 0;
        int flag2 = 0;
        int result = 1;
        for (int i =0;i < len;i++){
            flag1 = s.charAt(i);
            for (int j = i + 1;j < len;j++){
                flag2 = s.charAt(j);
                if (flag1 == flag2 && j != len - 1){
                    result = Math.max(result, (j-i));
                    break;
                }else if (j == len - 1)
                    result = Math.max(result, j - i + 1);
            }
        }
        return result;
    }

    public int method3(String s){
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while (i < s.length()) {
            int pos = s.indexOf(s.charAt(i),flag);
            if (pos < i) {
                if (length > result) {
                    result = length;
                }
                if (result >= s.length() - pos - 1) {
                    return result;
                }
                length = i - pos - 1;
                flag = pos + 1;
            }
            length++;
            i++;
        }
        return length;
    }

    public static void main(String[] args){
        topic_3 test = new topic_3();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        String s = sc.nextLine();
        System.out.println(test.lengthOfLongestSubstring(s));
    }
}
