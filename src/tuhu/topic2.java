package tuhu;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-30  15:02
 * @Description: https://www.nowcoder.com/test/question/done?tid=60439623&qid=1207240#summary
 * @Version: 1.0
 */
public class topic2 {
    public static void main(String[] args) {
        topic2 topic2 = new topic2();
        int[] array1 = new int[]{1,2,3,4};
        int[] array2 = new int[]{8,7};
        int[] result = topic2.arrayMerge(array1, array1.length, array2, array2.length);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public int[] arrayMerge (int[] array1, int n, int[] array2, int m) {
        // write code here
        int[] result = new int[n+m];
        int i = 0;//array1指针，从前向后
        int j = m-1;//array2指针，从后向前
        int k = 0;//result下标
        while (i < n && j >= 0){
            if (array1[i] < array2[j]){
                result[k] = array1[i];
                k++;
                i++;
            }else if (array1[i] > array2[j]){
                result[k] = array2[j];
                k++;
                j--;
            }else if (array1[i] == array2[j]){
                result[k] = array1[i];
                result[k + 1] = array2[j];
                k += 2;
                i++;
                j--;
            }
        }

        while (i < n){
            result[k] = array1[i];
            k++;
            i++;
        }

        while (j >= 0){
            result[k] = array2[j];
            k++;
            j--;
        }
        return result;
    }
}