package Chapter12.Exception_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-07 9:38
 */


public class Exception_1 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;//Scanner();

        try {
            int res=num1/num2;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常原因= " +e.getMessage());//输出异常信息

        }
        System.out.println("程序继续运行");
    }
}
