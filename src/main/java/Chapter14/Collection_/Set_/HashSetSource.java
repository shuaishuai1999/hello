package Chapter14.Collection_.Set_;

import java.util.HashSet;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 22:53
 */


public class HashSetSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("hashSet="+hashSet);



        //老韩对HashSet 的源码解读

        /*
        1.执行 HashSet（）
        public HashSet() {
        map = new HashMap<>();
         }
         */
        /*
        2.执行 add()
        public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
         */
        /*
        3.执行 put（） 该方法会执行hash（key）方法，得到对应的hash值， 算法 (h = key.hashCode()) ^ (h >>> 16)
        // h>>>16 -> 0000 0000 0000 0000  \  ^ 代码异或：不同为1，相同为0，
        //则(h = key.hashCode()) ^ (h >>> 16) 表示，只保留16位 即0-65535
        public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }
         */

        /*
        4.执行 putVal
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i; //定义了辅助变量

        //table 就是HashMap的一个数组，类型是Node[]
        //if 语句 表示如果当前table 是null，或者大小是 0，
        //就是第一次扩容，到16个空间
        if ((tab = table) == null || (n = tab.length) == 0) //
            n = (tab = resize()).length;

        //（1）根据key，得到hash 去计算该key应该存放到table表的哪个索引位置
        //并把这个位置的对象，赋给 p
        //(2) 判断p是否为 null，
        //（2.1） 如果p 为 null，表示还没有存放元素，就创建一个Node （key="java",value=PRESENT） 这个PRESENT为预置变量
        //（2.2） 就放在该位置 tab[i]=newNode(hash, key, value, null)
        // 15 按位与一个数，等于该数的 低四位
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {

            // 一个开发技巧提示：在需要局部变量（辅助变量），再创建
            Node<K,V> e; K k; //辅助变量
            //如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值一样
            //并且满足 下面两个条件之一
            //（1）准备加入的key 和 p 指向的Node节点 的key 是同一个对象
            //（2）或者准备加入的key 不为 null，但是与 p.key 相同
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;

            //再判断p 是不是一棵红黑树
            //如果是一棵红黑数，就调用putTreeVal ，来进行添加
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {// 如果当前table对应索引位置，已经是一个链表了，就是用for循环比较
                 //（1）依次和该链表的每一个元素比较后，都不相同，则加入到该链表的最后
                 //    注意在把元素添加到链表后，立即判断，该链表是否已经到达8个节点
                 //    ，就调用 treeifyBin() 对当前这个链表进行树化
                 //    注意，在转成红黑树时，要进行判断，判断条件
                 if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)  //MIN_TREEIFY_CAPACITY=64                                resize();
                 //   如果上面条件成立，先table扩容
                 //   只有上面条件不成立，才进行转成红黑树
                 //（2）如果和该链表的灭一个元素比较过程中，如果有相同情况，就直接 break
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st TREEIFY_THRESHOLD=8
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();

        // 空方法，为了让子类实现该方法，实现其他步骤
        afterNodeInsertion(evict);
        return null;
    }
         */

        /*
        5.执行 hash（） 方法
        static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
         */
//        Map

    }
}
