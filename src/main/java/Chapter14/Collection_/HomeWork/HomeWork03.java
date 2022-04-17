package Chapter14.Collection_.HomeWork;

import java.util.HashMap;
import java.util.Iterator;
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

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            Map.Entry entry=(Map.Entry) obj;
//            System.out.println(entry.getValue().getClass());
            map.put(entry.getKey(),(int)(entry.getValue())+100);
            System.out.println(entry.getKey()+"-"+entry.getValue());
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
