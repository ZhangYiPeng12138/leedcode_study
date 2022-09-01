package TencentMusic;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-13  20:24
 * @Description: 链接：https://www.nowcoder.com/question/next?pid=39959332&qid=2589595&tid=59600659
 * @Version: 1.0
 */
public class topic6 {
    public static void main(String[] args) {
        String s = "abc";
        for (int i = 0; i < s.length(); i++) {
            System.out.println((int)s.charAt(i));
        }
    }
    public int howMany (String S, int k) {
        // write code here
        int len = S.length();
        int result = 0;
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < len; i++) {
            int asc = S.charAt(i);
            arr[asc - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= k)
                result++;
        }
        return result;
    }
}