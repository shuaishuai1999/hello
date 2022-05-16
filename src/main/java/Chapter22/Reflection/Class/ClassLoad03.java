package Chapter22.Reflection.Class;

/**
 * @author shuaishuai
 * @create 2022-05-16 9:51
 * @Version 1.0
 * @Description 演示类加载-初始化阶段
 */

public class ClassLoad03 {
    public static void main(String[] args) {

    }
}
class B{
    static {
        System.out.println("B 静态代码块被执行");
        num=300;
    }
    static int num=100;
    public B(){
        System.out.println("B() 构造器被执行");
    }
}
