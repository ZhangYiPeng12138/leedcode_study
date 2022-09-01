package meituan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-20  10:18
 * @Description: TODO
 * @Version: 1.0
 */
public class topic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        topic2 t = new topic2();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] p = new int[n];
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
        }
        t.method(n,m,p,score);
        System.out.println(t.method(n,m,p,score));
    }

    public double method(int n, int m, int[] p, int[] score ) {
        int[] p_1 = new int[n];
        for (int i = 0; i < n; i++) {
            p_1[i] = 100 - p[i];
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += score[i]*p[i];
        }

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = score[i]*p_1[i];
        }
        Arrays.sort(temp);
        for (int i = 1; i <= m; i++) {
            result += temp[n-i];
        }
        double rate = new BigDecimal(result/100).setScale(1,BigDecimal.ROUND_DOWN).doubleValue();
        return rate;
    }
}