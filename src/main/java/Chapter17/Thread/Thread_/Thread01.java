package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-19 20:13
 * @Version 1.0
 * @Description  通过继承Thread 实现创建线程
 */

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建Cat对象，可以当作线程使用
        Cat cat = new Cat();
        //老韩读源码
        /*
        (1) public synchronized void start() { start0(); }
        (2) //start0() 是本地方法，是 JVM 调用, 底层是 c/c++实现
        //真正实现多线程的效果， 是 start0(),
        而不是 run private native void start0();
         */
        cat.start();//启动线程-> 最终会执行 cat 的 run 方法
        System.out.println("主线程继续执行" + Thread.currentThread().getName());//名字 main
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i=" + i); //让主线程休眠
            Thread.sleep(1000);
        }
    }
}
//老韩说明
// 1. 当一个类继承了 Thread 类， 该类就可以当做线程使用
// 2. 我们会重写 run 方法，写上自己的业务代码
// 3. run Thread 类 实现了 Runnable 接口的 run 方法
// /* @Override
// public void run() {
// if (target != null) {
// target.run();
// } } */

class Cat extends Thread {
    int times = 0;

    @Override
    public void run() {//重写 run 方法，写上自己的业务逻辑
        while (true) {
            //该线程每隔 1 秒。在控制台输出 “喵喵, 我是小猫咪”
            System.out.println("喵喵, 我是小猫咪" + (++times) + " 线程名=" + Thread.currentThread().getName());
            //让线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80) {
                break;
            }
        }
    }
}
