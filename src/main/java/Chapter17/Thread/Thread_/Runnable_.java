package Chapter17.Thread.Thread_;

/**
 * @author shuaishuai
 * @create 2022-04-20 10:14
 * @Version 1.0
 * @Description 通过Runnable创建线程
 */

public class Runnable_ {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start(); 这里不能调用 start

        Thread thread = new Thread(dog);
        thread.start();

         Tiger tiger = new Tiger();
//         实现了 Runnable
         ThreadProxy threadProxy = new ThreadProxy(tiger);
         threadProxy.start();
    }
}
class Animals{}
class Tiger extends Animals implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫。。。");
    }
}

//线程代理类 , 模拟了一个极简的 Thread 类
class ThreadProxy implements Runnable{
    private Runnable target=null;//属性，类型是Runnable
    @Override
    public void run() {
        if(target!=null){
            target.run();//动态绑定（运行类型）
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start(){
    start0();
     }
     public void start0(){
        run();
      }
}

class Dog implements Runnable{
    int count=0;
    @Override
    public void run() {
        while (true){
            System.out.println("小狗汪汪叫~~~"+(++count)+Thread.currentThread().getName());
        //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==10){
                break;
            }
        }

    }
}
