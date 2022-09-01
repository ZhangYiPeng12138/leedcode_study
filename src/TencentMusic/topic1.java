package TencentMusic;



import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-09  20:27
 * @Description: 题目链接：https://www.nowcoder.com/test/question/3a531996cc944a328ebc354749e96d27?pid=39959332&tid=59396441
 * @Version: 1.0
 */
public class topic1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,45};
        int box = 41;
        change(arr, box);
        System.out.println(change(arr, box));

    }
    public static int change (int[] oils, int box) {
        // write code here
        Arrays.sort(oils);
        int i = oils.length - 1;
        int res = 0;
        while(box != 0 && i >= 0){
            if (box >= oils[i]){
                res += box / oils[i];
                box = box % oils[i];
                i--;
            }else i--;
        }
        if (i == -1 && box != 0)
            return -1;
        else
            return res;
    }
}