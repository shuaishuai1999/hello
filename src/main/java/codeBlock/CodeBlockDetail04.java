package codeBlock;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 17:44
 */


public class CodeBlockDetail04 {
    public static void main(String[] args) {
//        C02 c02 = new C02();
        //output:
        //C02静态代码块
        //200
        //C02普通代码块
        //100
        //200

//        B02 b02 = new B02();
        //output:
        //getVal01
        //A02 第一个静态代码块
        //getVal03
        //B02 静态代码块
        //A02 第一个普通代码块
        //getVal02
        //A02的构造器
        //getVal04
        //B02 普通代码块
        //B02构造器

        A02 a02 = new A02();
        //output:
        //getVal01
        //A02 第一个静态代码块
        //A02 第一个普通代码块
        //getVal02
        //A02的构造器
    }
}
class A02{//父类
    private static int n1=getVal01();
    static {
        System.out.println("A02 第一个静态代码块");
    }
    {
        System.out.println("A02 第一个普通代码块");
    }
    public int n3=getVal02();
    public static int getVal01(){
        System.out.println("getVal01");//(1)
        return 10;
    }
    public static int getVal02(){
        System.out.println("getVal02");//(1)
        return 20;
    }

    public A02(){
        System.out.println("A02的构造器");
    }
}
class C02{
    private int n1=100;
    private static int n2=200;
    private void m1(){

    }
    private static void m2(){}

    static {
        System.out.println("C02静态代码块");
//        System.out.println(n1);//错误
        System.out.println(n2);
//        m1();//错误
        m2();
    }
    {
        System.out.println("C02普通代码块");
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }

}

class B02 extends A02{
    private static int n3=getVal03();
    static{
        System.out.println("B02 静态代码块");
    }
    public int n5=getVal04();
    {
        System.out.println("B02 普通代码块");
    }
    public static int getVal03(){
        System.out.println("getVal03");
        return 30;
    }
    public int getVal04(){
        System.out.println("getVal04");
        return 40;
    }

    public B02() {
        //隐藏了 //super()
        System.out.println("B02构造器");
    }
}
