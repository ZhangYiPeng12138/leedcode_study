import java.util.List;
import java.util.Stack;
import java.util.Scanner;
/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-22  16:10
 * @Description: TODO
 * @Version: 1.0
 */
public class topic_22 {

    public static void main(String[] args) {
        int[] arr = new int[105];
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int count = 0;
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            arr[count] = in.nextInt();
            count++;
        }

    }


}