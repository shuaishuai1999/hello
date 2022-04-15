package Chapter14.Collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-14 15:17
 */


public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //add:添加单个元素
        list.add("jack");
        list.add(10);//list.add(new Integer("10"))
        list.add(true);
        System.out.println("list ="+ list);//list =[jack, 10, true]


        //remove:删除指定元素
        list.remove(0);
        list.remove(true);
        System.out.println("list ="+ list);//list =[10]


        //contains:查找元素是否存在
        System.out.println(list.contains(10));//true


        //size:获取元素个数
        System.out.println(list.size());//1


        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());//false


        //clear:清空
        list.clear();
        System.out.println(list);//[]


        //addAll:添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演绎");
        list.addAll(arrayList);
        System.out.println(list);//[红楼梦, 三国演绎]


        //containsAll:查找多个元素是否存在
        System.out.println(list.containsAll(arrayList));//true


        //removeAll:删除多个元素
        list.add("聊斋");
        list.removeAll(arrayList);
        System.out.println(list);//[聊斋]

        //说明：以ArrayList 实现类来演示

    }
}
