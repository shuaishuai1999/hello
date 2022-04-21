package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-20 11:12
 * @Version 1.0
 * @Description
 */

public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        TT tt = new TT();
        System.out.println(tt.getName()+"状态"+ tt.getState());
        tt.start();
        while (Thread.State.TERMINATED!=tt.getState()){
            System.out.println(tt.getName()+"状态"+ tt.getState());
            Thread.sleep(500);
        }
        System.out.println(tt.getName()+"状态"+ tt.getState());

    }
}
class TT extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}
