public class topic_9 {
    public boolean isPalindrome(int x){
        int[] arr = new int[weishu(x)];
        if (x < 0)
            return false;
        if (x > 0){
            for (int i = arr.length-1;i >= 0;i--){
                arr[i] = x % 10;
                x /= 10;
            }
            for (int j = 0;j < arr.length/2;j++){
                if (arr[j] != arr[arr.length - j - 1])
                    return false;
            }
        }
        return true;
    }

    //        判断位数
    public int weishu(int x){
        int count = 0;
        while (x != 0){
            x /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        topic_9 test = new topic_9();
        System.out.println(test.isPalindrome(-1234));

    }
}
