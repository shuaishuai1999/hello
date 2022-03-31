package codeBlock;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 17:33
 */


public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
        //output:
        //AAA 的普通代码块被执行
        //AAA() 构造器被调用...
        //BBB 的普通代码块被执行
        //BBB() 构造器被调用...
    }
}
class AAA{//父类Object
    {
        System.out.println("AAA 的普通代码块被执行");
    }
    public AAA(){
        //(1)super()
        //(2)调用本类的普通代码块
        System.out.println("AAA() 构造器被调用...");
    }

}

class BBB extends AAA{
    {
        System.out.println("BBB 的普通代码块被执行");

    }

    public BBB() {
        //(1)super()
        //(2)调用本类的普通代码块
        System.out.println("BBB() 构造器被调用...");

    }
}
