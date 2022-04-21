package Chapter17.Thread.Thread_.HomeWork;

/**
 * @author shuaishuai
 * @create 2022-04-20 15:06
 * @Version 1.0
 * @Description
 */

public class HomeWork02 {
    public static void main(String[] args) throws InterruptedException {
        getCash getCash = new getCash();
        Thread thread1 = new Thread(getCash);
        thread1.start();

        Thread thread2 = new Thread(getCash);
        thread2.start();
    }
}
class getCash implements Runnable{
    private static int money=10000;
    private boolean loop=true;
    public synchronized void Out(){
        if(money<=0){
            System.out.println("余额不足。。。");
            loop=false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        money=money-1000;
        System.out.println(Thread.currentThread().getName()+"取钱一次。剩余金额："+money);
    }

    @Override
    public void run() {
       while (loop){
           Out();
       }
    }
}
