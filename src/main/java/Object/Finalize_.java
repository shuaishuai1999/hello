package Object;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 17:33
 */


public class Finalize_ {
    public static void main(String[] args) {
        Car car = new Car("宝马");
        //这时 car 对象就是一个垃圾,垃圾回收器就会回收(销毁)对象, 在销毁对象前，会调用该对象的 finalize 方法
        // ,程序员就可以在 finalize 中，写自己的业务逻辑代码(比如释放资源：数据库连接,或者打开文件..)
        // ,如果程序员不重写 finalize,那么就会调用 Object 类的 finalize, 即默认处理
        //,如果程序员重写了 finalize, 就可以实现自己的逻辑
        car=null; //这时car对象，没有任何引用  变成一个垃圾
        System.gc();//主动调用垃圾回收器
        System.out.println("程序退出了。。。");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁 汽车 "+name);
        System.out.println("我们释放了一些资源。。。");
    }
}
