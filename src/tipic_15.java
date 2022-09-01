import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-10  14:55
 * @Description: 链接：https://leetcode.cn/problems/3sum/
 * @Version: 1.0
 */
public class tipic_15 {
    public static void main(String[] args) {
        tipic_15 t = new tipic_15();
        int[] num = new int[]{-5,-4,-3,-3,1,1,1,2,3};
        t.threeSum(num);
        System.out.println(t.threeSum(num));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;//数组长度
        if (len < 3)
            return result;

        Arrays.sort(nums);//将数组进行排序
        for (int i = 0; i < len; i++) {
            //第一个元素大于0，结果必然为空
            if (nums[0] > 0)
                return result;
            //滑动至非重复元素
            if (i > 0 && nums[i] == nums[i-1])
                continue;

            int L = i+1;
            int R = len-1;
            while (L < R){
                int isZero = nums[i] + nums[L] + nums[R];
                if (isZero == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    result.add(list);
                    //滑动左指针重复元素
                    while ((L < R) && nums[L] == nums[L + 1])
                        L++;
                    //滑动右指针重复元素
                    while ((L < R) && nums[R] == nums[R - 1])
                        R--;
                    //无重复元素左指针右移，右指针左移
                    L++;
                    R--;
                }else if (isZero > 0)
                    R--;
                else
                    L++;
            }

        }
        return result;
    }
}