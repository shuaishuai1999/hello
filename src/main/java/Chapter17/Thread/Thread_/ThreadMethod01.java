package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-20 10:46
 * @Version 1.0
 * @Description
 */

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        //main方法
        //方式1：
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.setName("小笼包");
        threadDemo1.setPriority(Thread.MIN_PRIORITY);
        threadDemo1.start();

        //测试优先级
        System.out.println("默认优先级= "+Thread.currentThread().getPriority());
        //测试interrupt
        Thread.sleep(3000);
        threadDemo1.interrupt();
    }
}
class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"吃包子。。。");
        }
        try {
            System.out.println("休眠中。。。。");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            //当该进程执行到一个interrupt方法，就会catch一个异常，可以加入自己的业务代码
            System.out.println(Thread.currentThread().getName()+"被 interrupt了");
            e.printStackTrace();
        }
    }
}
