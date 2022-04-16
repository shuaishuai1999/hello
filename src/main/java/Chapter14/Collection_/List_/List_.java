package Chapter14.Collection_.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 14:37
 */


public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //1）List 集合类中元素有序 （即添加顺序和取出顺序一致），且可以
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkm");
        list.add("lpn");
        System.out.println(list);
        //2）List 集合中的每个元素都有其对应的顺序索引，即支持索引
        System.out.println(list.indexOf("abc"));//0
        System.out.println(list.get(3));//jkm

        //3）List容器中的元素都对应一个整数型的序号记载在其容器中的位置，可以根据序号存取容器中的元素
        //4）JDK API中List接口的实现常用有  ArrayList 、LinkedList 和 Vector

    }

}
