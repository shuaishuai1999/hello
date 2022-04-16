package Chapter14.Collection_.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 14:43
 */


public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();//List 实现 ArrayList 接口
        list.add("张三丰");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张三丰");
// void add(int index, Object ele):在 index 位置插入 ele 元素
// 在 index =1 的位置插入一个对象
        list.add(1, "avc");
        System.out.println("list =" + list);
// boolean addAll(int index, Collection eles):从 index 位置开始将 eles 中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list=" + list);//list=[张三丰, jack, tom, avc, 张三丰, 张三丰, 张三丰]

        // Object get(int index):获取指定 index 位置的元素
        // 说过
        // int indexOf(Object obj):返回 obj 在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));//2
        // int lastIndexOf(Object obj):返回 obj 在当前集合中末次出现的位置
        list.add("韩顺平");
        System.out.println("list=" + list);
        System.out.println(list.lastIndexOf("韩顺平"));//未找到 返回 -1
        // Object remove(int index):移除指定 index 位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list=" + list);
        // Object set(int index, Object ele):设置指定 index 位置的元素为 ele , 相当于是替换.
        list.set(1, "玛丽");
        System.out.println("list=" + list);
        // List subList(int fromIndex, int toIndex):返回从 fromIndex 到 toIndex 位置的子集合
        // 注意返回的子集合 fromIndex <= subList < toIndex
        List returnlist=list.subList(0,2);
        System.out.println("returnlist ="+returnlist);
    }
}
