package Chapter14.Collection_.HomeWork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 21:55
 */


public class HomeWork03 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);

        map.put("jack",2600);


        //第一种方法entrySet
//        System.out.println("第一种方法entrySet");
//        Set set = map.entrySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Object obj =  iterator.next();
//            Map.Entry entry=(Map.Entry) obj;
////            System.out.println(entry.getValue().getClass());
//            map.put(entry.getKey(),(int)(entry.getValue())+100);
//            System.out.println(entry.getKey()+"-"+entry.getValue());
//        }

        //第二种方法keySet
        System.out.println("===第二种方法===");
        Set set1 = map.keySet();
        for (Object key : set1) {
            map.put(key, (Integer)map.get(key)+100);
        }
        System.out.println(map);

        //values的使用
        System.out.println("===遍历所有value===");
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
    }
}
class employee{
    public String name;
    public double sal;

    public employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
