package tuhu;

import java.sql.Array;
import java.util.Arrays;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-30  15:41
 * @Description: https://www.nowcoder.com/question/next?pid=27666940&qid=1207236&tid=60459198
 * @Version: 1.0
 */
public class topic3 {
    public int reorder (int[] prices) {
        // write code here
        Arrays.sort(prices);
        int len = prices.length;
        int i = 0;
        int j = len / 2;
        int res = 0;
        while (i < len / 2 && j < len - 1){
            if (prices[i] < prices[j] && prices[i] < prices[j+1]){
                res++;
                i++;
                j++;
            }else i++;
        }
        return res;
    }
}