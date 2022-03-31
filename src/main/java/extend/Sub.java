package extend;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 15:09
 */


public class Sub extends Base{

    //调用父类的无参构造器，如下或者，什么都不写，默认就是调用super（）
    public Sub() {
        super("smith",10);
        System.out.println("子类Sub()构造器被调用...");
    }
    //当创建子类对象，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        super("tom",30);
        //do nothing
        System.out.println("子类Sub（String name）构造器被调用...");
    }

    public Sub(String name, int age) {
        super(name, age);
    }
    //子类方法
    public void sayOK(){
        //非私有的属性和方法可以在子类直接访问
        //但是私有属性和方法不能在子类直接访问
        System.out.println(n1+" "+n2+" "+n3);
        test100();
        test200();
        test300();
        //test400(); 报错
        //要通过父类提供公共的方法去访问
        System.out.println("n4="+getN4());
        callTest400();
    }
}
