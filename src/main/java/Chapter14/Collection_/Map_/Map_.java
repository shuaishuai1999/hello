package Chapter14.Collection_.Map_;

import java.util.HashMap;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-16 21:29
 */


public class Map_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //老韩解读 Map 接口实现类的特点, 使用实现类 HashMap
        // 1. Map 与 Collection 并列存在。用于保存具有映射关系的数据:Key-Value(双列元素)
        // 2. Map 中的 key 和 value 可以是任何引用类型的数据，会封装到 HashMap$Node 对象中
        // 3. Map 中的 key 不允许重复，原因和 HashSet 一样，前面分析过源码.
        // 4. Map 中的 value 可以重复
        // 5. Map 的 key 可以为 null, value 也可以为 null ，注意 key 为 null,
        //只能有一个，value 为 null ,可以多个
        // 6. 常用 String 类作为 Map 的 key
        // 7. key 和 value 之间存在单向一对一关系，即通过指定的 key 总能找到对应的 value
        HashMap hashMap = new HashMap();
        hashMap.put("no1","hsp");//k-v
        hashMap.put("no2","张无忌");//k-v
        hashMap.put("no3","张三丰");//k-v
        hashMap.put("no1","hsp1");//当有相同的k，就等价于替换
        hashMap.put("no4","hsp");
        hashMap.put(1,"hsp");
        hashMap.put(new Object(),"帅帅");//k-v
        System.out.println("hashMap =" + hashMap);

        //通过get方法，传入key，会返回对应的value
        System.out.println(hashMap.get("no1"));


    }
}
