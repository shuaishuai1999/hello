package Chapter14.Collection_.Map_;

import java.util.Hashtable;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 16:01
 */


public class hashTable_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        /**
         * 1）存放的元素是键值对
         * 2）hashtable的键和值不能为null，否则会抛出NullPointException
         * 3）hashTable使用方法基本上和hashMap一样
         * 4）hashTable 是线程安全的（synchronized），hashMap是线程不安全的
         */
//        hashtable.put(null,null);//NullPointerException
//        hashtable.put("hsp",null);//NullPointerException
//        hashtable.put(null,"1234");//NullPointerException
        hashtable.put(1,"123");
        System.out.println("hashtable = "+hashtable);

        hashtable.put(1,"345");//替换
        System.out.println("hashtable = "+hashtable);


    }
}
