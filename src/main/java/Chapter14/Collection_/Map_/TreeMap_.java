package Chapter14.Collection_.Map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 16:39
 */


public class TreeMap_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //使用默认的构造器，创建 TreeMap, 是无序的(也没有排序)
        /*
        老韩要求：按照传入的 k(String) 的大小进行排序
        */
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeMap.put("a", "a");
        treeMap.put("ab", "ab");
        treeMap.put("abc", "abc");
        System.out.println("treeMap= " + treeMap);


        /**
         * 源码分析
         *
         * 1. 构造器. 把传入的实现了 Comparator 接口的匿名内部类(对象)，传给给 TreeMap 的 comparator
         * public TreeMap(Comparator<? super K> comparator) { this.comparator = comparator; }
         * 2. 调用 put 方法 2.1 第一次添加, 把 k-v 封装到 Entry 对象，放入 root
         * public V put(K key, V value) {
         *         Entry<K,V> t = root;  //辅助变量
         *         if (t == null) {
         *             compare(key, key); // type (and possibly null) check
         *
         *             root = new Entry<>(key, value, null);
         *             size = 1;
         *             modCount++;
         *             return null;
         *         }
         *         int cmp;
         *         Entry<K,V> parent;
         *         // split comparator and comparable paths
         *         Comparator<? super K> cpr = comparator;
         *         if (cpr != null) {
         *             do { //遍历所有的key，给当前的key找到合适位置
         *                 parent = t;
         *                 cmp = cpr.compare(key, t.key);//动态绑定到我们的匿名内部类的 compare
         *                 if (cmp < 0)
         *                     t = t.left;
         *                 else if (cmp > 0)
         *                     t = t.right;
         *                 else
         *                     return t.setValue(value);
         *             } while (t != null);
         *         }
         *         else {//如果遍历过程中，发现准备添加 Key 和当前已有的 Key 相等，就不添加
         *             if (key == null)
         *                 throw new NullPointerException();
         *             @SuppressWarnings("unchecked")
         *                 Comparable<? super K> k = (Comparable<? super K>) key;
         *             do {
         *                 parent = t;
         *                 cmp = k.compareTo(t.key);
         *                 if (cmp < 0)
         *                     t = t.left;
         *                 else if (cmp > 0)
         *                     t = t.right;
         *                 else
         *                     return t.setValue(value);
         *             } while (t != null);
         *         }
         *     }
         */
    }
}
