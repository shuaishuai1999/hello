package innerClass;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-02 10:43
 */


public class MemberInnerClass01 {
    public static void main(String[] args) {
        //外部其他类访问成员内部类的三种方式
        //第一种方式，方法调用内部类成员
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //第二种方式，使用outer对象创建一个 inner对象
        //outer08.new Inner08(); outer08对象 创建一个 Inner08对象
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        //第三种方式  在外部类种，编写一个方法，可以返回inner08对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();


    }
}
class Outer08{//外部类
    private int n1=100;
    public String name="张三";


    public void hi(){
        System.out.println("hi()方法");
     }
    //1，注意：成员内部类，是定义在外部内的成员位置上。
    //2.2）可以添加任意访问修饰符，因为他就是一个成员

    public class Inner08{
        private double sal=99.0;
        private int n1=66;
        public void say(){
            ////可以直接访问外部类的所有成员，包含私有的
            // 如果成员内部类的成员和外部类的成员重名，会遵守就近原则.
            // ，可以通过 外部类名.this.属性 来访问外部类的成员
            System.out.println(n1+" "+Outer08.this.n1+" 已进入成员内部类 ");
            hi();

         }
    }
    //方法，返回一个Inner08 实例
    public Inner08 getInner08Instance(){
        return new Inner08();
    }

    //写方法
    public void t1(){
        //使用成员内部类
        //创建成员内部类的对象，然后使用相关方法
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}
