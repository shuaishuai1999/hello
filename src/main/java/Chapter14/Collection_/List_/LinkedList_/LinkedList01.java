package Chapter14.Collection_.List_.LinkedList_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 16:33
 */


public class LinkedList01 {
    public static void main(String[] args) {
        // 模拟一个简单的双向链表

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("老韩");

        //连接三个节点，形成双链表
        //jack->tom->hsp
        jack.next = tom;
        tom.next = hsp;
        //hsp->tom->jack
        hsp.pre = tom;
        tom.pre = jack;

        Node first = jack;// 让first 引用指向 jack，就是双向链表的头节点
        Node last = hsp;// 让last引用指向 hsp，就是双向链表的尾节点


        //演示，从头到尾遍历
        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first=first.next;
        }

        //演示，从尾到头遍历
        System.out.println("===从尾到头进行遍历===");
        while (true){
            if(last==null){
                break;
            }
            //输出last信息
            System.out.println(last);
            last=last.pre;
        }

            //演示链表的添加对象/数据，是多么的方便
            // 要求，是在 tom --------- 老韩直接，插入一个对象 smith
            // 1. 先创建一个 Node 结点，name 就是 smith
            Node smith = new Node("smith");
            //下面就把smith 加入到双向列表了
            smith.next=hsp;
            smith.pre=tom;

            hsp.pre=smith;
            tom.next=smith;

            //让first再次指向jack
            first=jack;//让 first引用指向jack，就是双向链表的头节点
            //演示，从头到尾遍历
            System.out.println("===从头到尾进行遍历===");
            while (true) {
                if (first == null) {
                    break;
                }
                //输出first信息
                System.out.println(first);
                first=first.next;
            }

            last=hsp;

            //演示，从尾到头遍历
            System.out.println("===从尾到头进行遍历===");
            while (true){
                if(last==null){
                    break;
                }
                //输出last信息
                System.out.println(last);
                last=last.pre;

            }
    }


}

class Node {
    public Object item;//真正存放数据
    public Node next;//指向后一个节点
    public Node pre;//指向前一个节点

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
