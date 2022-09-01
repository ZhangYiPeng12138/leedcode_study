import java.util.Map;

/**
 * 最长公共前缀问题：输入是一个字符串数组，要求输出公共的前缀字符串
 *
 * 思路：只要求公共前缀，可以将字符串的若干个元素分为“两两进行比较”
 *      第一个元素与第二个元素先得出一个公共前缀，再用这个公共前缀
 *      与第三个元素得出公共前缀，依此类推得出结果
 * 实现过程：1、重载一个longestCommonPrefix方法，方法的形参为两个字符串，
 *            该方法的功能是求出两个字符串的公共前缀
 *         2、longestCommonPrefix方法中，将形参的第一个元素先作为公共前缀
 *            从第二个元素开始遍历字符串数组，依次得出公共前缀
 *            任何时候如果得出的公共前缀长度为0则结束循环
 */
public class topic_14 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        String[] arry_of_string = new String[]{"flower","flow","flight"};
        System.out.println(s1.longestCommonPrefix("abcde", "abcde"));
        System.out.println(s1.longestCommonPrefix(arry_of_string));
    }
}

class Solution1{
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return " ";
        String result = strs[0];
        for (int i = 1;i < strs.length;i++){
            result = longestCommonPrefix(result, strs[i]);
            if (result.length() == 0) break;
        }
        return result;
    }

    public String longestCommonPrefix(String s1, String s2){
        int len = Math.min(s1.length(), s2.length());
        int index = 0;
        for (int i = 0;i < len;i++){
            if (s1.charAt(i) == s2.charAt(i)){
                index ++;
            }else break;
        }
        return s1.substring(0, index);
    }
}