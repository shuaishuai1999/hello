package poly_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-23 10:29
 */


public class PloyMethod {
    public static void main(String[] args) {
        //方法重载体现多态
        A a = new A();
        System.out.println(a.sum(10,20));
        System.out.println(a.sum(10,20,30));

        B b = new B();
        a.say();
        b.say(); //就近原则
    }
}
class B{//父类
    public void say(){
        System.out.println("B say()方法被调用");
     }
}
class A extends B{//子类
    public int sum(int n1,int n2){//和下面sum构成重载
        return n1+n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public void say(){
        System.out.println("A 中say（）方法被调用");
     }
}
