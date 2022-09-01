/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-03  19:34
 * @Description: 给你一个字符串 s，找到 s 中最长的回文子串。
 *  输入：s = "babad"
    输出："bab"
    解释："aba" 同样是符合题意的答案。
 * @Version: 1.0
 */
public class topic_5 {
    public static void main(String[] args) {
        topic_5 topic_5 = new topic_5();
        System.out.println(topic_5.longestPalindrome1("aaaaa"));
//        System.out.println("bababa".substring(0, 2));
    }

    public String longestPalindrome(String s){
        int len = s.length();
        if (len == 0) return null;
        if (len == 1) return s;

        boolean[][] isPalind = new boolean[len][len];//判断i到j的字符串是否为回文
        int maxLen = 1;//记录最长回文串长度
        int start = 0;//最长回文串开始位置
        int end = 0;//最长回文串结束位置

        for (int i = 0;i < len;i++){
            isPalind[i][i] = true;
        }
        for (int i = 0;i < len;i++){
            for (int j = len -1;j > 0;j--){
                if (s.charAt(i) != s.charAt(j)){
                    isPalind[i][j] = false;
                }else {
                    if ((j - i) < 3){
                        isPalind[i][j] = true;
                    }else isPalind[i][j] = isPalind[i + 1][j - 1];
                }

                if (isPalind[i][j] && (j - i + 1) > maxLen){
                    start = i;
                    end = j;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(start, end + 1);
    }

    public String longestPalindrome1(String s){
        int len = s.length();
        if (len < 2) return s;

        boolean[][] isPalind = new boolean[len][len];//判断i到j的字符串是否为回文
        int maxLen = 1;//记录最长回文串长度
        int start = 0;//最长回文串开始位置
        int end = 0;//最长回文串结束位置

        for (int L = 2;L <= len;L++){
            for (int i = 0;i < len;i++){
                int j = L + i - 1;
                if (j >= len) break;
                if (s.charAt(i) != s.charAt(j)){
                    isPalind[i][j] = false;
                }else {
                    if ((j - i) < 3){
                        isPalind[i][j] = true;
                    }else isPalind[i][j] = isPalind[i + 1][j - 1];
                }

                if (isPalind[i][j] && (j - i + 1) > maxLen){
                    start = i;
                    end = j;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}