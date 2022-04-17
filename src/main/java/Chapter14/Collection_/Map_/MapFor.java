package Chapter14.Collection_.Map_;

import java.util.*;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 10:13
 */


public class MapFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", new Book("", 100));//OK
        map.put("邓超", "孙俪");//替换
        map.put("王宝强", "马蓉");//OK
        map.put("宋喆", "马蓉");//OK
        map.put("刘令博", null);//OK
        map.put(null, "刘亦菲");//OK
        map.put("鹿晗", "关晓彤");//OK

        //第一组：先取出 所有的Key，通过Key 取出对应的 Value
        Set keyset = map.keySet();

        //(1) 增强for
        System.out.println("-----第一种方式-----");
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }

        //(2) 迭代器
        System.out.println("-----第二种方式-----");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-"+map.get(key));
        }

        //第二组：把所有values取出
        Collection values = map.values();

        //(1)增强for
        System.out.println("---取出所有的 value 增强 for----");
        for (Object value : values) {
            System.out.println(value);
        }

        //(2)迭代器
        System.out.println("---取出所有的 value 迭代器----");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }

        //第三组： 通过EntrySet 来获取k-v
        Set entryset = map.entrySet();

        //(1) 增强for
        System.out.println("----使用 EntrySet 的 for 增强(第 3 种)----");
        for (Object entry : entryset) {
            //将 entry 转换为 Map.Entry
            Map.Entry entry1=(Map.Entry)entry;
            System.out.println(entry1.getKey()+"-"+entry1.getValue());
        }

        //(2)迭代器
        System.out.println("----使用 EntrySet 的 迭代器(第 4 种)----");
        Iterator iterator2 = entryset.iterator();
        while (iterator2.hasNext()) {

            Object entry =  iterator2.next();
            //向下转型
//            System.out.println(entry);
            Map.Entry m=(Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
    }
}
