package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-20 10:53
 * @Version 1.0
 * @Description
 */

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        //说明：
        //1.让jd插队到主线程前面，这样main就会等待jd执行完毕，在执行
        //2.如果没有join，那么。johnThread和main就会交替执行
        t.join();
        for (int i = 0; i < 20; i++) {
            System.out.println("张三丰。。。");
        }
    }
}
class T extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("johnThread..."+i);
        }
    }
}
