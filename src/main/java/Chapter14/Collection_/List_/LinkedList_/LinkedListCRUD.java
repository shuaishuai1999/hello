package Chapter14.Collection_.List_.LinkedList_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 21:41
 */


public class LinkedListCRUD {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);

        //演示一个删除节点的
        linkedList.remove();//默认删除第一个节点
        linkedList.remove(0);
        System.out.println("linkedList=" + linkedList);

        //修改某个节点
        linkedList.set(0, 999);
        System.out.println("linkedList=" + linkedList);//linkedList=[999]

        //得到某个节点对象
        //get(1) 是得到双向链表的第二个对象
        Object o = linkedList.get(0);
        System.out.println(o);

        linkedList.add("123");

        //因为LinkedList是 实现了 List 接口，遍历方式
        System.out.println("===LinkList遍历迭代器===");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("===LinkedList遍历增强for===");
        for (Object o1 : linkedList) {
            System.out.println(o1);
        }


        System.out.println("===LinkedList普通for循环===");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        //老韩源码阅读.
        // 1. LinkedList linkedList = new LinkedList();
        // public LinkedList() {}
        // 2. 这时 linkeList 的属性 first = null last = null
        // 3. 执行 添加
       /*
        public boolean add (E e)
        {
            linkLast(e);
            return true;
        }
        4. 将新的结点，加入到双向链表的最后 void linkLast (E e){
            final Node<E> l = last;
            final Node<E> newNode = new Node<>(l, e, null);
            last = newNode;
            if (l == null) first = newNode;
            else l.next = newNode;
            size++;
            modCount++;
        } */


        /* 老韩读源码 linkedList.remove();
        // 这里默认删除的是第一个结点
        1. 执行 removeFirst public E remove()
         { return removeFirst();
         }
         */

       /* 2. 执行
        public E removeFirst() {
            final Node<E> f = first;
            if (f == null) throw new NoSuchElementException();
            return unlinkFirst(f);
        }
        3. 执行 unlinkFirst, 将 f 指向的双向链表的第一个结点拿掉
        private E unlinkFirst (Node < E > f)
        {
            assert f == first && f != null;
            final E element = f.item;
            final Node<E> next = f.next;
            f.item = null;
            f.next = null;//help GC
             first = next;
            if (next == null) last = null;
            else next.prev = null;
            size--;
            modCount++;
            return element;*/
    }
}

