package TencentMusic;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 小红拿到了一个数组 a，每次操作小红可以选择数组中的任意一个数减去 x，小红一共能进行 k 次。
 小红想在 k 次操作之后，数组的最大值尽可能小。请你返回这个最大值。
 */
public class topic2 {
    public static void main(String[] args) {
        topic2 t = new topic2();
//        t.minMax([1, 2, 3, 4], 4, 1);
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(-1);
        System.out.println(i);
    }

    public int minMax (ArrayList<Integer> a, int k, int x) {
        // write code here
        PriorityQueue<Integer> queue = new PriorityQueue<>( (o1, o2) -> o2-o1);
        for (int i : a){
            queue.add(i);
        }
        for (int i = 0; i < k; i++) {
            int max = queue.poll();
            queue.add(max - x);
        }
        return queue.poll();
    }
}