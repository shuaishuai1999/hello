package Chapter14.Collection_.Map_;

import java.util.HashMap;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 11:04
 */


public class HashMapSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("java","10");//k-v
        hashMap.put("no2","张无忌");//k-v
        hashMap.put("no3","张三丰");//k-v

        /**
         * 老韩解读 HashMap 的源码+图解
         * 1. 执行构造器 new HashMap()
         * 初始化加载因子 loadfactor = 0.75
         * HashMap$Node[] table = null
         * 2. 执行 put 调用 hash 方法，计算 key 的 hash 值 (h = key.hashCode()) ^ (h >>> 16)
         * public V put(K key, V value) {//K = "java" value = 10
         *     return putVal(hash(key), key, value, false, true);
         *     }
         * 3. 执行 final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i; //辅助变量
         *         //如果底层的table数组为null，或者length=0，就扩容到16
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         //取出hash值对应的 table的索引位置的 Node，如果为null，就直接把加入的 k-v
         *         //，创建成一个Node，加入该位置即可
         *         if ((p = tab[i = (n - 1) & hash]) == null)
         *             tab[i] = newNode(hash, key, value, null);
         *         else {
         *             Node<K,V> e; K k; //辅助变量
         *             //如果table的索引位置的key 和 hash 和新的 key 的 hash 值相同
         *             //并满足，（table现有的节点的key和准备添加的key是同一个对象 || equals 返回真）
         *             //就认为不能添加入新的 k-v
         *             if (p.hash == hash &&
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             //如果当前的 table的已有的 Node 是红黑树，就按照红黑树的方式处理
         *             else if (p instanceof TreeNode)
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {
         *             //如果找到的节点，后面是链表，就循环比较
         *                 for (int binCount = 0; ; ++binCount) { //死循环
         *                     if ((e = p.next) == null) { //如果整个链表，没有和他相同，就加入到该链表的最后
         *                         p.next = newNode(hash, key, value, null);
         *                         // 加入后，判断当前链表的个数，是否达到8个，到 8个，后
         *                         // 就调用treeifyBin方法进行红黑树转换 TREEIFY_THRESHOLD=8
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash && //如果在死循环中找到相同的，就break，就只是替换value
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         break;
         *                     p = e;//将 p向后移动一位
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value; // 替换 value值
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount; //每增加一个Node，就size++
         *         if (++size > threshold)//如size > 临界值 ，就扩容 12（16*0.75）->24->48->x*0.75
         *             resize();
         *         afterNodeInsertion(evict);
         *         return null;
         *     }
         *    5. 关于树化(转成红黑树) //如果 table 为 null ,或者大小还没有到 64，暂时不树化，而是进行扩容.
         *    //否则才会真正的树化 -> 剪枝
         *    final void treeifyBin(Node<K,V>[] tab, int hash) {
         *      int n, index; Node<K,V> e;
         *      if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
         *       resize();
         *      }
         */



        /***
         * 自己解读
         *1.调用 put 方法
         * public V put(K key, V value) {
         *         return putVal(hash(key), key, value, false, true);
         *     }
         * 调用 map的 hash 方法
         *
         * 2.进入 putVal 方法
         * final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i;
         *         //如果 table 为空，或者 table的长度 为 0
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             //进入resize() 方法
         *             n = (tab = resize()).length;
         *         // 如果加入的节点为空，则将新的元素添加到该节点
         *         if ((p = tab[i = (n - 1) & hash]) == null)
         *             tab[i] = newNode(hash, key, value, null);
         *         //如果加入的节点不为空
         *         else {
         *             Node<K,V> e; K k;
         *             // 如果
         *             if (p.hash == hash &&
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             else if (p instanceof TreeNode)
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {
         *                 for (int binCount = 0; ; ++binCount) {
         *                     if ((e = p.next) == null) {
         *                         p.next = newNode(hash, key, value, null);
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 // 替换value
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value;
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount;
         *         if (++size > threshold)
         *             resize();
         *         afterNodeInsertion(evict);
         *         return null;
         *     }
         *
         *     3.resize（） 方法
         *     final Node<K,V>[] resize() {
         *         Node<K,V>[] oldTab = table;
         *         //如果 oldtable 为空，置为0，否则，保持不变
         *         int oldCap = (oldTab == null) ? 0 : oldTab.length;
         *         // 临界值 0
         *         int oldThr = threshold;
         *         int newCap, newThr = 0;
         *         if (oldCap > 0) {
         *         // MAXIMUM_CAPACITY = 1 << 30
         *         //如果 oldtable 容量 大于 1<<30 把临界值改为 1 << 31
         *             if (oldCap >= MAXIMUM_CAPACITY) {
         *             //Integer.MAX_VALUE = 1 << 31
         *                 threshold = Integer.MAX_VALUE;
         *                 return oldTab;
         *             }
         *         // 如果 oldtable 容量 *2 小于 1<<30 并且 大于默认初始化容量 16，则将容量置为原来的两倍
         *             else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
         *                      oldCap >= DEFAULT_INITIAL_CAPACITY)
         *                 newThr = oldThr << 1; // double threshold
         *         }
         *         else if (oldThr > 0) // initial capacity was placed in threshold
         *             newCap = oldThr;
         *         else {               // zero initial threshold signifies using defaults
         *             newCap = DEFAULT_INITIAL_CAPACITY;
         *             newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY); //DEFAULT_LOAD_FACTOR默认加载因子 0.75
         *         }
         *         if (newThr == 0) {
         *             float ft = (float)newCap * loadFactor;
         *             newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
         *                       (int)ft : Integer.MAX_VALUE);
         *         }
         *         threshold = newThr;
         *         @SuppressWarnings({"rawtypes","unchecked"})
         *             Node<K, V>[] newTab = (Node<K,V>[])new Node[newCap];
         *         table = newTab;
         *         if (oldTab != null) {
         *             for (int j = 0; j < oldCap; ++j) {
         *                 Node<K,V> e;
         *                 if ((e = oldTab[j]) != null) {
         *                     oldTab[j] = null;
         *                     if (e.next == null)
         *                         newTab[e.hash & (newCap - 1)] = e;
         *                     else if (e instanceof TreeNode)
         *                         ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
         *                     else { // preserve order
         *                         Node<K,V> loHead = null, loTail = null;
         *                         Node<K,V> hiHead = null, hiTail = null;
         *                         Node<K,V> next;
         *                         do {
         *                             next = e.next;
         *                             if ((e.hash & oldCap) == 0) {
         *                                 if (loTail == null)
         *                                     loHead = e;
         *                                 else
         *                                     loTail.next = e;
         *                                 loTail = e;
         *                             }
         *                             else {
         *                                 if (hiTail == null)
         *                                     hiHead = e;
         *                                 else
         *                                     hiTail.next = e;
         *                                 hiTail = e;
         *                             }
         *                         } while ((e = next) != null);
         *                         if (loTail != null) {
         *                             loTail.next = null;
         *                             newTab[j] = loHead;
         *                         }
         *                         if (hiTail != null) {
         *                             hiTail.next = null;
         *                             newTab[j + oldCap] = hiHead;
         *                         }
         *                     }
         *                 }
         *             }
         *         }
         *         return newTab;
         *     }
         *
         */
    }
}
