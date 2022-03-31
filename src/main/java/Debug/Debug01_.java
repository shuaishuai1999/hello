package Debug;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 20:05
 */


public class Debug01_ {
    public static void main(String[] args) {
        //演示逐行执行代码
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + i);
        }
        System.out.println("退出 for....");
    }
}

