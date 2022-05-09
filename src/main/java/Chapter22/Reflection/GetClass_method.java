package Chapter22.Reflection;

/**
 * @author shuaishuai
 * @create 2022-05-12 15:23
 * @Version 1.0
 * @Description 演示得到 Class对象的各种方式 6种
 */

public class GetClass_method {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.已知类的全路径，可以直接使用Class类的静态方法forName获取Class对象
        Class<?> aClass1 = Class.forName("Chapter22.Reflection.Cat");
        System.out.println(aClass1.getClass());

        //2.已知具体的类，通过类的class获取，该方式最为安全可靠，程序性能最高  用于参数传递
        Class<Cat> catClass = Cat.class;
        System.out.println(catClass.getClass());

        //3.通过某个对象的实例getClass获取Class对象
        Cat cat = new Cat();
        Class<? extends Cat> aClass = cat.getClass();
        System.out.println(aClass.getClass());

        //4.其他方式 通过类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?> aClass2 = classLoader.loadClass("Chapter22.Reflection.Cat");
        System.out.println(aClass2.getClass());

        System.out.println(aClass1.hashCode());
        System.out.println(catClass.hashCode());
        System.out.println(aClass.hashCode());
        System.out.println(aClass2.hashCode());
        //output
        //21685669
        //21685669
        //21685669
        //21685669  都为同一个对象


        //5.基本数据类型（int,char,boolean,float,double,byte,long,short）按如下方式得到Class类对象
//        Class cls=基本数据类型.class
        Class<String> stringClass = String.class;
        System.out.println(stringClass.getClass());//class java.lang.Class
        System.out.println(stringClass.getName());


        //6.基本数据类型对应的包装类，可以通过.TYPE 得到Class类对象
        Class<Integer> type = Integer.TYPE;
        System.out.println(type.getClass());//class java.lang.Class
        System.out.println(type.getName());//int


    }
}
