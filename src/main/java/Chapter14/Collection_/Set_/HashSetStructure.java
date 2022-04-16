package Chapter14.Collection_.Set_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 22:52
 */


public class HashSetStructure {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //模拟一个HashSet的底层， （HashMap 的底层结构）

        //1.创建一个数组，数组的类型是 Node[]
        //2.有些人，直接把Node[] 数组称为表
        Node[] table = new Node[16];
        System.out.println("table =" + table);

        //3.创建节点
        Node john = new Node("john", null);

        table[2]=john;

        //将jack节点挂在john后
        Node jack = new Node("jack", null);
        john.next=jack;
        System.out.println("挂载后"+table);

        //将rose节点挂在jack后
        Node rose = new Node("rose", null);
        jack.next=rose;

        Node lucy = new Node("lucy", null);
        table[3]=lucy; //把lucy放到table表第三个位置
    }
}
class Node{// 节点，存储数据，可以指向下一个节点，从而形成链表
    Object item; // 存放数据
    Node next; // 指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
