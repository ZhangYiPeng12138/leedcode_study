import java.time.temporal.ChronoField;
import java.util.HashMap;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-22  09:07
 * @Description: TODO
 * @Version: 1.0
 */
public class topic3_1 {
    public static void main(String[] args) {
        topic3_1 t = new topic3_1();
        System.out.println(t.lengthOfLongestSubstring("abba"));
        System.out.println(t.lengthOfLongestSubstring("abcabcbb"));
    }
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int result = 0;
        int len = s.length();
        int left = 0;
        if (len < 2) return len;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i)))
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            map.put(s.charAt(i), i);
            result = Math.max(result, i - left + 1);
        }
        return result;
    }

    public int lengthOfLongestSubstring1(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int result = 0;
        int start = 0;
        int end = 0;
        int len = s.length();
        for (; end < len; end++) {
            if (map.containsKey(s.charAt(end))){
                start = Math.max(start, map.get(s.charAt(end)) + 1);
            }
            map.put(s.charAt(end), end);
            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}
