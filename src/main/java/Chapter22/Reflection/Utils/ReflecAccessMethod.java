package Chapter22.Reflection.Utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shuaishuai
 * @create 2022-05-16 17:38
 * @Version 1.0
 * @Description 演示通过反射调用方法
 */

public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> bossCls = Class.forName("Chapter22.Reflection.Utils.Boss");
        Object o = bossCls.newInstance();
        Method hi = bossCls.getMethod("hi", String.class);
        Method hi1 = bossCls.getDeclaredMethod("hi", String.class);
        hi.invoke(o,"韩顺平教育");

        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        //因为say方法是private，所以需要爆破，原理和前面将的构造器和属性一样
        say.setAccessible(true);
        System.out.println(say.invoke(o,100,"张三",'男'));
        //因为say方法是static的，还可以这样调用，可以传入null
        System.out.println(say.invoke(null,200,"李四",'女'));

        //在反射中，如果方法有返回值，同一返回object，但是它运行类型和方法定义的返回类型一致
        Object reVal = say.invoke(null, 300, "王五", '男');
        System.out.println("reVal的运行类型="+reVal.getClass());

        //再演示一个返回的案例
        Method m1 = bossCls.getDeclaredMethod("m1");
        Object reVal2 = m1.invoke(o);
        System.out.println("reVal2的运行类型="+reVal2.getClass());

    }
}
