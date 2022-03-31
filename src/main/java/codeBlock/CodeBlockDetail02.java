package codeBlock;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 17:14
 */


public class CodeBlockDetail02 {

    public static void main(String[] args) {

//        4）创建一个对象时，在一个类 调用的顺序是：（重点，难点）
//	①调用静态代码块和静态属性初始化（注意：静态代码块和静态属性初始化调用的优先级是一样的，如果又多个静态代码块和多个静态变量初始化，则按照他们定义的顺序调用）
//	②调用普通代码块和普通属性的初始化（注意：优先级也是一样，按照定义顺序调用）
//	③调用构造方法
        A a = new A("hello");
        //output:
        //静态代码块被初始化
        //普通代码块被初始化
        //构造器被初始化
    }
}

class A {
    private static final String string = "static变量";//静态变量
    private String base = "base";//基础变量

    {//普通代码块
        System.out.println("普通代码块被初始化");
    }

    static {
        System.out.println("静态代码块被初始化");
    }

    //静态方法
    private static void static_() {
        System.out.println(string);
        System.out.println("静态方法被初始化");
//        System.out.println(base);//报错，因为静态方法只能调用静态变量
    }

    //普通方法
    public void base() {
        System.out.println(base);
        System.out.println(string);
        System.out.println("基础方法被初始化");
    }

    public A(String base) {
        this.base = base;
        System.out.println("构造器被初始化");
    }
}
