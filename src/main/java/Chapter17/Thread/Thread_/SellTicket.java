package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-20 10:31
 * @Version 1.0
 * @Description 使用多线程，模拟三个窗口同时售票 100 张
 */

public class SellTicket {
    public static void main(String[] args) {
        //测试 thread
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket011 = new SellTicket01();
        SellTicket01 sellTicket012 = new SellTicket01();

        //这里我们会出现超卖.
        sellTicket01.start();
        sellTicket011.start();
        sellTicket012.start();

//        System.out.println("使用实现接口方式来售票");
//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
//        new Thread(sellTicket02).start();
    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 100;//让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread() + "售出一张票。" + "剩余票数= " + (--ticketNum));
        }
    }
}

class SellTicket02 implements Runnable {
    private int ticketNum = 100;//让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread() + "售出一张票。" + "剩余票数= " + (--ticketNum));
        }
    }
}
