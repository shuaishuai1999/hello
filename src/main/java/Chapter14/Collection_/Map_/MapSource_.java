package Chapter14.Collection_.Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-16 22:46
 */

@SuppressWarnings({"all"})
public class MapSource_ {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("no1","hsp");
        map.put("no2","zwj");


        //老韩解读
        //1， k-v 最后是 HashMap$Node node = newNode(hash, key, value, null)
        //2. k-v 为了方便程序员遍历，还会创建 EntrySet 集合， 该集合存放的元素类型为 Entry，而一个Entry
        // 对象就有 k，v EntrySet<Entry<k,v>> 即：transient Set<Map.Entry<k,v>> entrySet;
        //3, entrySet 中，定义类型是Map.Entry, 但是实际上存放数据的还是 HashMap$Node
        //  这是因为  static class Node<K,V> implements Map.Entry<K,V>
        //4. 当把HashMap$Node 对象 存放到 entrySet 就方便我们遍历，因为Map.Entry 提供了重要方法。
        // K getKey();V getValue();

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object o : set) {
//            System.out.println(o.getClass());//class java.util.HashMap$Node
            //为了 从当把HashMap$Node 取出 k-v
            //1.先做一个向下转型
            Map.Entry entry=(Map.Entry)o;

            String x = "k=" + entry.getKey() +" "+ "v=" + entry.getValue();
            System.out.println(x);
        }
        Set set1=map.keySet();
        Collection values = map.values();
        System.out.println(set1.getClass());
        System.out.println(values.getClass());
    }
}
