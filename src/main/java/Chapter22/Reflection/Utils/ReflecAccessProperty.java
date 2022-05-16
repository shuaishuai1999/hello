package Chapter22.Reflection.Utils;

import java.lang.reflect.Field;

/**
 * @author shuaishuai
 * @create 2022-05-16 17:31
 * @Version 1.0
 * @Description 演示反射操作属性
 */

public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = Class.forName("Chapter22.Reflection.Utils.Student");
        Object o = aClass.newInstance();

        System.out.println(o.getClass());
        Field age = aClass.getField("age");
        //通过反射来操作属性
        age.set(o,88);
        System.out.println(o);
        System.out.println(age.get(o));//返回age的值

        Field name = aClass.getDeclaredField("name");
        //对name进行爆破，可以操作private属性
        name.setAccessible(true);//取消访问检查，提升反射效率
        name.set(o,"老韩");
//        name.set(null,"老韩~");//因为name是static属性，因此o也可以写成null
        System.out.println(o);
        System.out.println(name.get(o));//获取属性值
        System.out.println(name.get(null));//获取属性值，要求name是static



    }
}
