package innerClass;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 19:41
 */



//局部内部类
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02 的hashcode"+outer02);
    }

}


//如果定义类在局部位置（方法中/代码块）：（1）局部内部类， （2）匿名内部类

class Outer02{
    private int n1=100;
    private void n2(){
        System.out.println("Outer02 m2()");
    }//私有方法
    public void m1(){//方法

    //说明：局部内部类是定义在外部类的局部位置，比如方法中，并且有类名。
        // 2.不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量是不能使用修饰符的
        // 但是可以用final修饰，因为局部变量也可以用final修饰。
        //3.作用域：仅仅在定义它的方法或代码块中


        final class inner02{//局部内部类本质仍然是一个类
            //1.可以直接访问外部类的所有成员，包含私有的
            private int n1=800;
            public void f1(){
                //4.局部内部类---访问---》外部类的成员  【访问方式：直接访问】

                //如果内部类想访问外部类的成员，则可以使用   （外部类名.this.成员）去访问
                // 例如：       System.out.println("外部类的n2"+外部类的n2.this.n2);
                System.out.println("n1="+n1+ " 外部类的 n1="+Outer02.this.n1);
                System.out.println("Outer02.this hashcode"+Outer02.this);
                n2();
            }
        }
        //外部类中。可以创建Inner02 对象， 然后调用方法
        inner02 inner02 = new inner02();
        inner02.f1();
    }
}
