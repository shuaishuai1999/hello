package Chapter14.Collection_.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 14:54
 */


public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List 接口的实现子类 Vector LinkedList
         List list1 = new ArrayList();
//        List list1 = new Vector();
//        List list1=new LinkedList();
        list1.add("jack");
        list1.add("jack1");
        list1.add("jack2");
        list1.add("jack3");


        //1) 方式一：使用iterator
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        //2）方式二：增强for
        for (Object obj : list1){
            System.out.println(obj);
        }

        //3）方式三：普通for循环
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
