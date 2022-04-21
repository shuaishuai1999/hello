package Chapter17.Thread.Thread_.HomeWork;

import java.util.Scanner;

/**
 * @author shuaishuai
 * @create 2022-04-20 14:23
 * @Version 1.0
 * @Description
 */

public class HomeWork01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        Thread thread1 = new Thread(t1);
        thread1.start();

        T2 t2 = new T2(t1);
        new Thread(t2).start();//启动第二个进程
    }
}
class T1 implements Runnable{
     private boolean loop =true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){
            System.out.println((int)(100 *Math.random()+1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 当键盘输入Q时，终止进程1
class T2 extends Thread{
    private Scanner scanner=new Scanner(System.in);
    private T1 t1;

    public T2(T1 t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        while (true){
            //接受用户收入
            System.out.println("请输入指令（Q）表示退出：");
            char key=scanner.next().toUpperCase().charAt(0);
            if(key=='Q'){
                //以通知的方式结束T1，线程
                t1.setLoop(false);
                System.out.println("T2,线程退出");
                break;
            }
        }
    }
}
