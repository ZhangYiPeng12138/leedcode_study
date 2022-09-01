import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-07-15  20:14
 * @Description: TODO
 * @Version: 1.0
 */
public class topic_13 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("请输入罗马数字");
        String roman = s1.next();
        System.out.println(solution.romanToInt(roman));
    }
}

class Solution{
    Map<Character, Integer> Values = new HashMap<Character, Integer>(){
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public int romanToInt(String s) {
        int result = 0;
        int value;
        for (int i = 0;i < s.length();i++){
            value = Values.get(s.charAt(i));
            if (i < s.length()-1 && value < Values.get(s.charAt(i+1))){
                result -= value;
            }else {
                result += value;
            }
        }
        return result;
    }
}