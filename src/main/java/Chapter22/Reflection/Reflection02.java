package Chapter22.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shuaishuai
 * @create 2022-05-09 21:45
 * @Version 1.0
 * @Description 测试反射调用的性能，和优化方案
 */

public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        //Field //Method //Constructor
         m1();//传统
         m2();//反射
         m3();//反射优化
    }
    //传统
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1方法耗时 "+(end-start));

    }

    //反射
    public static void m2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("Chapter22.Reflection.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2方法耗时 "+(end-start));

    }

    //反射优化
    public static void m3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("Chapter22.Reflection.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");

        hi.setAccessible(true);//在反射调用方法时，取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m3方法耗时 "+(end-start));
    }
}
