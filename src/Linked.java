/**
 * @BelongsProject: leedcode_study
 * @Author: zhangyipeng
 * @CreateTime: 2022-08-22  15:12
 * @Description: TODO
 * @Version: 1.0
 */
public class Linked <T> {
    private class Node{
        private T t;
        private Node next;

        public Node(T t) {
            this.t = t;
            this.next = null;
        }

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }
    }

    private Node head;
    private int size;
    public Linked(){
        this.head = null;
        this.size = 0;
    }
}