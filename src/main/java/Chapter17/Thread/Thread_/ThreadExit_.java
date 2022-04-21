package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-20 10:40
 * @Version 1.0
 * @Description
 */

public class ThreadExit_ {
    public static void main(String[] args) {
        AThread aThread = new AThread();
        new Thread(aThread).start();//启动子线程
        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(50);//让主线程休眠50毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程运行中");
            if (i==30){
                //中断子线程
                aThread.setLoop(false);
            }
        }
    }
}
class AThread implements Runnable{
    boolean loop=true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){
            System.out.println("无限循环中。。。");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
