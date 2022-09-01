import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.List;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-18  22:33
 * @Description: https://leetcode.cn/problems/letter-combinations-of-a-phone-number/
 * @Version: 1.0
 */
public class topic_17 {
    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<Character, String>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        return null;
    }
}