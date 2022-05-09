package Chapter22.Reflection.Class;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author shuaishuai
 * @create 2022-05-12 15:04
 * @Version 1.0
 * @Description  Class类常用方法介绍
 */

public class Class02UsedMethod {
    public static void main(String[] args) throws Exception {
        //1.forName  返回指定类名的class对象
        Class<?> aClass = Class.forName("Chapter22.Reflection.Cat");
        System.out.println(aClass.getClass());//class java.lang.Class
        //2.aClass.newInstance() 获取class对象实例
        Object o = aClass.newInstance();
        //3.aClass.getMethod() 获取类指定方法
        Method method = aClass.getMethod("hi");
        method.invoke(o);//执行方法

        //属性
        Field field = aClass.getField("name");
        System.out.println(field.get(o));//阿花

        field.set(o,"changename");
        System.out.println(field.get(o));//changename 名字已修改
        //4.获取包名
        System.out.println(aClass.getPackage().getName());//Chapter22.Reflection
        //5.获取全类名
        System.out.println(aClass.getName());//Chapter22.Reflection.Cat
        //6.获取所有属性  注意：反射方法无法获取私有属性
        Field[] fields = aClass.getFields();
        for (Field field1 : fields) {
            System.out.println(field1.getName());
        }
    }
}
