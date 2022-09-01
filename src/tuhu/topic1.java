package tuhu;

/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-30  14:55
 * @Description: https://www.nowcoder.com/test/question/done?tid=60439623&qid=1207235#summary
 * @Version: 1.0
 */
public class topic1 {
    public static void main(String[] args) {
        topic1 topic1 = new topic1();
        System.out.println(topic1.combination(2,5));
    }
    public int combination (int r, int n) {
        if (r == 0)
            return 1;
        if (r == 1)
            return n;
        if (r > n/2){
            return combination(n-r, n);
        }else return combination(r, n-1) + combination(r-1, n-1);

    }
}