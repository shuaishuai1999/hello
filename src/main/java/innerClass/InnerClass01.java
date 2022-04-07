package innerClass;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 19:28
 */


public class InnerClass01 {
    public static void main(String[] args) {

    }
}

//如果定义类在局部位置（方法中/代码块）：（1）局部内部类， （2）匿名内部类
//定义在成员位置：（1）成员内部类 （2）静态内部类
//一个类的内部又完整的嵌套了另一个类结构。被嵌套的类称为内部类（inner class），嵌套其他类的类称为外部类（outer class）。
// 是我们类的第五大成员【属性，方法，构造器，代码块，内部类】。内部类最大的特点就是可以直接访问私有属性，并且可以体现类与类之间的包含关系。【难点，重点】

class Outer{//外部类
    private int n1=100;//属性
//构造器
    public Outer(int n1) {
        this.n1 = n1;
    }

    //方法
    public void m1(){
        System.out.println("m1()");
    }

    {
        System.out.println("代码块");
    }

    class inner{//内部类，在Outer类的内部

    }



}
