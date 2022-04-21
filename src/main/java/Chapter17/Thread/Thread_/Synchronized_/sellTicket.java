package Chapter17.Thread.Thread_.Synchronized_;

/**
 * @author shuaishuai
 * @create 2022-04-20 10:31
 * @Version 1.0
 * @Description 使用多线程，模拟三个窗口同时售票 100 张
 */

public class sellTicket {
    public static void main(String[] args) {
        SellTicket02 sellTicket02sellTicket02 = new SellTicket02();
        System.out.println(System.currentTimeMillis());
        new Thread(sellTicket02sellTicket02).start();
        new Thread(sellTicket02sellTicket02).start();
        new Thread(sellTicket02sellTicket02).start();
        new Thread(sellTicket02sellTicket02).start();
//        new Thread(sellTicket02sellTicket02).start();
//        new Thread(sellTicket02sellTicket02).start();
//        new Thread(sellTicket02sellTicket02).start();
//        new Thread(sellTicket02sellTicket02).start();

    }
}


//实现接口方式，使用synchronized实现线程同步
class SellTicket02 implements Runnable {
    private int ticketNum = 1000;//让多个线程共享 ticketNum
    private boolean loop = true;//控制 run 方法变量
    Object object = new Object();

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
    //同步方法（静态的）的锁为当前类本身
    //1. public synchronized static void m1() {} 锁是加在 SellTicket02.class
    // 2. 如果在静态方法中，实现一个同步代码块.
    // /* synchronized (SellTicket02.class) { System.out.println("m2"); } */

    public synchronized static void m1() {
    }

    public static void m2() {
        synchronized (SellTicket02.class) {
            System.out.println("m2");
        }
    }

    //老韩说明
    // 1. public synchronized void sell() {} 就是一个同步方法
    // 2. 这时锁在 this 对象
    // 3. 也可以在代码块上写 synchronize ,同步代码块, 互斥锁还是在 this 对象
    // public /*synchronized*/ void sell() {
    // 同步方法, 在同一时刻， 只能有一个线程来执行 sell 方法
    public /*synchronized*/ void sell() {
        synchronized (object) {
            if (ticketNum <= 0) {
                System.out.println("售票结束。。。");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" + " 剩余票数=" + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();//sell 方法是同步方法
        }
    }
}
