/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-10  14:24
 * @Description: 链接：https://leetcode.cn/problems/container-with-most-water/
 * @Version: 1.0
 * 思路：双指针
 */
public class topic11 {

    //时间超出限制
    public int maxArea(int[] height) {
        int len = height.length;
        if (len <= 1)
            return 0;
        int result = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = (j - i)*Math.min(height[i], height[j]);
                result = Math.max(temp,result);
            }
        }
        return result;
    }

    public int maxArea1(int[] height){
        int len = height.length;
        if (len <= 1)
            return 0;
        int left = 0;//左指针
        int right = len - 1;//右指针
        int result = 0;//结果
        while (left < right){
            int temp = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, temp);
            if (height[left] <= height[right]){
                left++;
            }else right--;
        }
        return result;
    }
}