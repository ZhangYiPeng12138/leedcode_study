package meituan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-20  10:03
 * @Description: TODO
 * @Version: 1.0
 */
public class topic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        topic1 t = new topic1();
        int x = scanner.nextInt();
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println(t.method(x, s1, s2));
    }

    public ArrayList<Character> method(int x, String s1, String s2){
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            result.add(s1.charAt(i));
            result.add(s2.charAt(i));
        }
        return result;
    }
}