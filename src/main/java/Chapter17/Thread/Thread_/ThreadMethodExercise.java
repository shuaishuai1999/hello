package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-20 10:57
 * @Version 1.0
 * @Description 1.主线程每隔1s，输出hi，一共10次
 * 2，当输出到hi 5时，启动一个子线程（要求实现runnable接口），每隔1s输出hello，等该线程输出10次hello 后，退出
 * 3.主线程继续输出hi，直到主线程退出
 */

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        son son = new son();
        for (int i = 1; i < 10; i++) {
            System.out.println("hi" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 5) {
                Thread thread = new Thread(son);
                thread.start();
                thread.join();

            }
        }
    }
}

class son implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("hello" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}
