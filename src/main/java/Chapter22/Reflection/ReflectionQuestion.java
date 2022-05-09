package Chapter22.Reflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author shuaishuai
 * @create 2022-05-09 21:00
 * @Version 1.0
 * @Description   反射问题的引入
 */

public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        //根据配置文件 re.properties 指定信息, 创建 Cat 对象并调用方法 hi
        // 老韩回忆
        // 传统的方式 new 对象 -》 调用方法
        // Cat cat = new Cat();
        // cat.hi(); ===> cat.cry() 修改源码.
        // 我们尝试做一做 -> 明白反射

        //1. 使用 Properties 类, 可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/java/Chapter22/Reflection/re.properties"));
        System.out.println(properties.getProperty("classfullpath").toString());
        System.out.println(properties.getProperty("method").toString());


        //2.使用反射
        //(1) 加载类, 返回 Class 类型的对象 cls
        Class<?> classfullpath = Class.forName(properties.getProperty("classfullpath").toString());
        //(2) 通过 cls 得到你加载的类 com.hspedu.Cat 的对象实例
        Object o = classfullpath.newInstance();
        System.out.println(o.getClass());
        //(3) 通过 cls 得到你加载的类 Chapter22.Reflection.Cat 的 methodName"hi" 的方法对象
        // 即：在反射中，可以把方法视为对象（万物皆对象）
        Method method = classfullpath.getMethod(properties.getProperty("method").toString());
        System.out.println(method);
        method.invoke(o);//执行反射来的方法 反射语法： 方法.invoke(Class对象) 传统方法：对象.方法

    }
}
