import java.util.Stack;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-22  10:53
 * @Description: https://leetcode.cn/problems/valid-parentheses/comments/
 * @Version: 1.0
 */
public class topic_20 {
    public static void main(String[] args) {
        topic_20 t = new topic_20();
        t.isValid("()()");
    }
    public boolean isValid(String s) {
        if (s.length() < 2)return false;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '(')
                stack.push(')');
            else if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (stack.isEmpty() || c != stack.pop())
                return false;
        }
        return true;
    }
}