package Chapter14.Collection_.Map_;

import java.util.Properties;
import java.util.Set;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 16:14
 */


public class Properties_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //老韩解读
        // 1. Properties 继承 Hashtable
        // 2. 可以通过 k-v 存放数据，当然 key 和 value 不能为 null
        // 增加
        Properties properties = new Properties();
//        properties.put(null,"abc");//NullPointerException
//        properties.put("abc",null);//NullPointerException
        properties.put("john", 100);//k-v
        properties.put("lucy", 100);
        properties.put("find","i found it");
        properties.put("lic", 100);
        properties.put("lic", 88);//如果有相同的 key ， value 被替换
        System.out.println("properties = " + properties );

        //1.通过k获取对应值
        System.out.println(properties.get("lic"));//88

        // 2.getProperty 如果查找对象不为String，则返回null
        System.out.println(properties.getProperty("find"));//i found it

        //删除
        properties.remove("lic");
        System.out.println("properties = "+ properties);//properties = {john=100, lucy=100}

        //修改
        properties.put("john",200);
        System.out.println("properties = "+ properties);//properties = {john=200, lucy=100}

    }
}
