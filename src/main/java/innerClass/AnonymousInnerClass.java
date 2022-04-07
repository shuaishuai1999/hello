package innerClass;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 20:40
 */


public class AnonymousInnerClass {
}

class Outer04{
    private int n1=100;
    public void method(){//方法
        //基于接口的匿名内部类
        //老韩解读
        //1.需求： 想使用IA接口，并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        //3，需求是： Tiger/Dog 类只是使用一次，后面不在使用
        //4.可以使用匿名内部类来简化开发
        //5.tiger的编译类型？
        //6.tiger的运行类型？就是匿名内部类


    }
}

interface IA{
   void cry();
}
