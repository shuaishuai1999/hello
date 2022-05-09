package Chapter22.Reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author shuaishuai
 * @create 2022-05-09 21:20
 * @Version 1.0
 * @Description
 */

public class Reflection01 {
    public static void main(String[] args) throws Exception {
        //反射得到类的对象，成员方法，成员变量，构造器
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/java/Chapter22/Reflection/re.properties"));

        //(1) 加载类, 返回 Class 类型的对象aClass
        Class<?> aClass = Class.forName
                (properties.getProperty("classfullpath"));
        System.out.println(aClass);

        //(2) 通过 aClass 得到你加载的类 com.hspedu.Cat 的对象实例
        //对象
        Object o = aClass.newInstance();//cat 类的对象
        System.out.println(o.getClass());

        //(3) 通过 aClass 得到你加载的类 com.hspedu.Cat 的 methodName"hi" 的方法对象
        // 即：在反射中，可以把方法视为对象（万物皆对象）
        //方法
        Method method = aClass.getMethod(properties.getProperty("method"));
//        System.out.println(method);

        //(4) 通过 method 调用方法: 即通过方法对象来实现调用方法
        System.out.println(method.invoke(o));  //传统方法 对象.方法() , 反射机制 方法.invoke(对象)
        //java.lang.reflect.Field: 代表类的成员变量, Field 对象表示某个类的成员变量
        //变量name
        //getField 不能得到私有的属性
        Field name = aClass.getField("name");
        System.out.println(name.get(o));  // 传统写法 对象.成员变量 , 反射 : 成员变量对象.get(对象)
        //构造器
        Constructor<?> constructor = aClass.getConstructor();
        System.out.println(constructor);//无参构造器

        Constructor<?> name1 = aClass.getConstructor(String.class);//这里老师传入的 String.class 就是 String 类的 Class 对象
        System.out.println(name1);

    }

}
