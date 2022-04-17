package Chapter14.Collection_.Map_;


import java.util.HashMap;
import java.util.Map;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-16 21:41
 */


public class MapMethod_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //演示map接口的常用方法
        Map map = new HashMap();
        map.put("邓超", new Book("", 100));//OK
        map.put("邓超", "孙俪");//替换
        map.put("王宝强", "马蓉");//OK
        map.put("宋喆", "马蓉");//OK
        map.put("刘令博", null);//OK
        map.put(null, "刘亦菲");//OK
        map.put("鹿晗", "关晓彤");//OK
        map.put("hsp", "hsp 的老婆");
        System.out.println("map =" + map);
        // remove:根据键删除映射关系
//        map.remove(null);
        System.out.println("map=" + map);
        // get：根据键获取值
        Object val = map.get("鹿晗");
        System.out.println("val=" + val);
        // size:获取元素个数
        System.out.println("k-v=" + map.size());
        // isEmpty:判断个数是否为 0
        System.out.println(map.isEmpty());//F
        // clear:清除 k-v
//        map.clear();
        System.out.println("map=" + map);
        // containsKey:查找键是否存在
        System.out.println("结果=" + map.containsKey("hsp"));//T
    }
}

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
