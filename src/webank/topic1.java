package webank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-30  21:24
 * @Description: https://www.nowcoder.com/questionTerminal/2f97620c519b41cfa85649b55299c06a?answerType=1&f=discussion
 * @Version: 1.0
 */
public class topic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        while (count < n){
            arr[count++] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}