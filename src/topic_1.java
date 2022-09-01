public class topic_1 {
    public int[] two_sum(int[] nums, int target){
        int res[] = new int[2];
        for (int i = 0;i < nums.length;i++){
            for (int j = 0;j < nums.length;j++){
                if ((i != j) && (nums[i] + nums[j]) == target){
                        res[0] = i;
                        res[1] = j;

                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        topic_1 ex = new topic_1();
        int[] arr = new int[]{2,3,5,11,25};
        int[] res = ex.two_sum(arr, 36);
        System.out.println(res[0] + "and" + res[1]);
    }
}
