package Chapter22.Reflection.Utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author shuaishuai
 * @create 2022-05-16 10:24
 * @Version 1.0
 * @Description 演示如何通过反射获取类的结构信息
 */

public class ReflectionUtils {
    public static void main(String[] args) throws ClassNotFoundException {
        ReflectionUtils reflectionUtils = new ReflectionUtils();
        reflectionUtils.api_01();
        reflectionUtils.api_02();
    }

    //第二组方法api
    public void api_02() throws ClassNotFoundException {
        //得到Class对象
        Class<?> personCls = Class.forName("Chapter22.Reflection.Utils.Person1");
        //getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName()
                    + "该属性的修饰符值" + declaredField.getModifiers()
                    + "该属性的类型" + declaredField.getType());

        }
        //getDeclaredMethods获取本类中所有的方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName()
                    + " 该方法的访问修饰符值=" + declaredMethod.getModifiers()
                    + " 该方法返回类型" + declaredMethod.getReturnType());
            //输出当前这个方法的形参数组情况
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的形参类型" + parameterType);
            }
        }
        //
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("================");
            System.out.println("本类中所有构造器=" + constructor.getName());

            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的形参类型=" + parameterType);
            }
        }
    }

    //第一组方法API
    public void api_01() throws ClassNotFoundException {
        //得到Class对象
        Class<?> personCls = Class.forName("Chapter22.Reflection.Utils.Person1");
        //getName:获取全类名
        System.out.println(personCls.getName());
        //getSimpleName()获取简单类名
        System.out.println(personCls.getSimpleName());

        //getFields：:获取所有 public 修饰的属性，包含本类以及父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println("本类以及父类的属性=" + field.getName());
        }
        //getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName()
                    + "该属性的修饰符值" + declaredField.getModifiers()
                    + "该属性的类型" + declaredField.getType());

        }
        //getMethods:获取所有public修饰的方法，包含本类以及父类
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类及父类的方法=" + method.getName());
        }
        //getDeclaredMethods获取本类中所有的方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName()
                    + " 该方法的访问修饰符值=" + declaredMethod.getModifiers()
                    + " 该方法返回类型" + declaredMethod.getReturnType());
            //输出当前这个方法的形参数组情况
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的形参类型" + parameterType);
            }
        }
        //getConstructors：获取所有public修饰的构造器，包含本类
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("================");
            System.out.println("本类中所有构造器=" + constructor.getName());

            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的形参类型=" + parameterType);
            }
        }
        //getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类中所有构造器=" + declaredConstructor.getName());
        }
        //getPackage():以Package形式返回，包信息
        System.out.println(personCls.getPackage());
        //getSuperclass 以Class形式返回父类信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println("父类的class对象" + superclass);
        //getInterfaces 以Class[]形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息" + anInterface);
        }
        //getAnnotations以Annotation[]形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息=" + annotation);
        }
    }
}

class A {
    public String hobby;

    public void hi() {
    }

    public A() {
    }

    public A(String name) {
    }
}

interface IA {
}

interface IB {
}

