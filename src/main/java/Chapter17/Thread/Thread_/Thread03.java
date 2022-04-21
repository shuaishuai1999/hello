package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-20 10:26
 * @Version 1.0
 * @Description main 线程启动两个子线程
 */

public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t2);

        thread.start();//启动第一个线程
        thread1.start();//启动第二个线程
    }
}
class T1 implements Runnable{

    @Override
    public void run() {
        int count=0;
        while (true){
            //每隔1秒输出 “hello world”一次
            System.out.println("hello world "+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==60){
                break;
            }
        }
    }
}
class T2 implements Runnable{

    @Override
    public void run() {
        int count=0;
        while (true) {
            System.out.println("hi "+ (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==50){
                break;
            }
        }

    }
}
