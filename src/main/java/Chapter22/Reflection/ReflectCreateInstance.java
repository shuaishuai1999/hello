package Chapter22.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author shuaishuai
 * @create 2022-05-16 16:44
 * @Version 1.0
 * @Description 演示通过反射机制创建实例
 */

public class ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.先获取到User 类的Class对象
        Class<?> aClass = Class.forName("Chapter22.Reflection.User");
        //2.通过public的无参构造器创建实例
        Object o = aClass.getInterfaces();
        System.out.println(o);
        //3.通过public的有参构造器创建实例
        /* constructor 对象就是 public User(String name) {//public 的有参构造器 this.name = name; } */
        //3.1 先得到对应构造器
        Constructor<?> constructor = aClass.getConstructor(String.class);
        //3.2 创建实例，并传入实参
        Object hsp = constructor.newInstance("hsp");
        System.out.println("hsp="+hsp);
        //4.通过非 public 的有参构造器创建实例
        //4.1 得到private的构造器对象
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, String.class);
        //4.2 创建实例
        //暴破【暴力破解】 , 使用反射可以访问 private 构造器/方法/属性, 反射面前，都是纸老虎
        declaredConstructor.setAccessible(true);
        Object 张三丰 = declaredConstructor.newInstance(100, "张三丰");
        System.out.println("张三丰="+张三丰);

    }
}
