package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-20 11:06
 * @Version 1.0
 * @Description 将一个线程设置为守护进程
 */

public class ThreadMethod03Daemon {
    public static void main(String[] args) throws InterruptedException {
        DaemonThread daemonThread = new DaemonThread();
        //daemonThread 设置为守护进程，当所有线程结束后，daemonThread
        //如果没有设置，那么及时main线程执行完毕，daemonThread
        daemonThread.setDaemon(true);
        daemonThread.start();
        for (int i = 0; i < 100; i++) {
            Thread.sleep(50);
            System.out.println("宝强辛苦工作。。。");
        }

    }
}
class DaemonThread extends Thread{
    @Override
    public void run() {
        for (;;){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("马蓉和宋吉吉快乐聊天，哈哈。。。");
        }
    }
}
