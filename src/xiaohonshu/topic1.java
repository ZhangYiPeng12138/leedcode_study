package xiaohonshu;

        import java.util.*;


public class topic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        int count1 = 0;
        int[] arr1 = new int[list.size()];
        for (Integer a : list){
            arr1[count1] = a;
            count1++;
        }

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i != j){
                    map.put(count, arr1[i]*arr1[j]);
                    count++;
                }else continue;
            }
        }
        for (Map.Entry<Integer, Integer> vo : map.entrySet()){
            if (vo.getValue()>=k)
                result++;
        }
        System.out.println(result);
    }
}