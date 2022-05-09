package Chapter22.Reflection.AllTypeClass;

import java.io.Serializable;

/**
 * @author shuaishuai
 * @create 2022-05-12 15:38
 * @Version 1.0
 * @Description 演示哪些类型有 Class对象
 */

public class AllTypeClass {
    public static void main(String[] args) {
        //1.外部类，成员内部类，静态内部类，局部内部类，匿名内部类
        //2.interface 接口
        //3.数组
        //4.enum:枚举
        //5.annotation注解
        //6.数据基本类型
        //7.void

        Class<String> cls1 = String.class;//外部类
        Class<Serializable> cls2 = Serializable.class;//接口
        Class<Integer[]> cls3 = Integer[].class;//数组
        Class<float[][]> cls4 = float[][].class;//二维数组
        Class<Deprecated> cls5 = Deprecated.class;//注解

        //枚举
        Class<Thread.State> cls6 = Thread.State.class;
        Class<Long> cls7 = long.class;//基本数据类型
        Class<Void> cls8 = void.class;//void数据类型
        Class<Class> cls9 = Class.class;

        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls4);
        System.out.println(cls5);
        System.out.println(cls6);
        System.out.println(cls7);
        System.out.println(cls8);
        System.out.println(cls9);



    }
}
