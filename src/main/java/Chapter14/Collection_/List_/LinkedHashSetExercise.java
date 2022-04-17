package Chapter14.Collection_.List_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-16 20:53
 */


public class LinkedHashSetExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        LinkedHashSet linkedHashSet = new LinkedHashSet();
        // 分析一下 LinkedHashSet底层机制
       Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(123);
        set.add("HSP");
    //老韩解读
        // 1.LinkedHashSet 的加入顺序和输出顺序一致
        System.out.println(set);

        //2. LinkedHashSet 底层维护的是一个 LinkedHashMap（是HashMap类）
        //3. LinkedHashSet 底层结构（数组＋双向链表）
        //4、添加第一次是，直接将table 扩容到16 ，存放的结点类型是 LinkedHashMap$Entry
        //5.数组是 HashMap$Node[] 存放的元素/数据 是LinkedHashMap$Entry类型
        /**
         * static class Entry<K,V> extends HashMap.Node<K,V> {
         *         Entry<K,V> before, after;
         *         Entry(int hash, K key, V value, Node<K,V> next) {
         *             super(hash, key, value, next);
         *         }
         *     }
         */












    }
}
