package webank;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//给你一个长度为n的序列A，你需要算出有多少个三元组(Ai，Aj,Ak)满足i<j<k且AiAjAk。

public class topic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> used = new ArrayList<>();       // 已使用数据
        ArrayList<Integer> standby = new ArrayList<>();    // 待使用数据
        int[] arr = new int[n + 1];
        for(int i = 0; i < n; i++) {
            arr[i + 1] = sc.nextInt();
            if(i == 0)
                used.add(arr[i + 1]);
            else
                standby.add(arr[i + 1]);
        }
        Collections.sort(standby);
        long res = 0L;
        for(int i = 2; i <= n; i++){
            // 以arr[i]作为中间数
            int minIdx = upper_bound(used, arr[i]);       // 从小索引的数据中找到第一个大于arr[i]的位置
            int maxIdx = lower_bound(standby, arr[i]);    // 从大索引的数据中找到第一个大于等于arr[i]的位置
            long count1 = minIdx;                         // minIdx前面的数都可以作为三元组的最小数
            long count2 = standby.size() - maxIdx - 1;    // maxIdx后面的数都可以作为三元组的最大数
            res += count1 * count2;          // 累加上以arr[i]为中间数时的三元组数
            used.add(minIdx, arr[i]);
            standby.remove(maxIdx);
        }
        System.out.println(res);
    }

    private static int lower_bound(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        int res = right + 1;
        while(left <= right){
            int mid = (left + right) >> 1;
            if(list.get(mid) >= target){
                right = mid - 1;
                res = mid;
            }else{
                left = mid + 1;
            }
        }
        return res;
    }

    private static int upper_bound(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        int res = right + 1;
        while(left <= right){
            int mid = (left + right) >> 1;
            if(list.get(mid) > target){
                right = mid - 1;
                res = mid;
            }else{
                left = mid + 1;
            }
        }
        return res;
    }
}