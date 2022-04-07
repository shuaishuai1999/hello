package innerClass;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-02 11:11
 */


public class StaticInnerClass {
    public static void main(String[] args) {
        //静态内部类的访问方式三种
        //第一种，使用外部类方法
        Outer10 outer10 = new Outer10();
        outer10.t1();

        //第二种，使用外部类成员方法，创建一个实例
        Outer10.Inner10 inner08Instance = outer10.getInner08Instance();
        inner08Instance.say();

        //第三种：如果是静态成员，可以直接使用 类名.静态成员 直接访问
        Outer10.Inner10 inner10=new Outer10.Inner10();
        inner10.say();


    }
}

class Outer10{//外部类
    private static int n1=100;
    public String name="张三";


    public static  void hi(){
        System.out.println("hi()方法");
    }
    //1，注意：成员内部类，是定义在外部内的成员位置上。
    //2.2）可以添加任意访问修饰符，因为他就是一个成员

    public static class Inner10{
        private double sal=99.0;
        private int n1=66;
        public void say(){
            ////可以直接访问外部类的所有成员，包含私有的
            // 如果成员内部类的成员和外部类的成员重名，会遵守就近原则.
            // ，可以通过 外部类名.this.属性 来访问外部类的成员
            System.out.println(n1+" "+this.n1+" 已进入静态内部类 ");
            hi();

        }
    }
    //方法，返回一个Inner08 实例
    public Inner10 getInner08Instance(){
        return new Inner10();
    }

    //写方法
    public void t1(){
        //使用成员内部类
        //创建成员内部类的对象，然后使用相关方法
        Inner10 inner10 = new Inner10();
        inner10.say();
        System.out.println(inner10.sal);
    }
}

