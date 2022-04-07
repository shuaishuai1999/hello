package Chapter12.Try_catch;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-07 10:19
 */


public class TryCatch01 {
    public static void main(String[] args) {
        int num11=10;
        int num2=0;//Scanner();
////1. 如果异常发生了，则异常发生后面的代码不会执行，直接进入到 catch 块
// 2. 如果异常没有发生，则顺序执行 try 的代码块，不会进入到 catch
// 3. 如果希望不管是否发生异常，都执行某段代码(比如关闭连接，释放资源等)则使用如下代码- finally
//4.可以有多个catch语句，捕获不同的异常（进行不同业务的处理），要求父类异常在后，子类异常在前，比如（Exception在后，NullPointerException在前），
// 如果发生异常，只会匹配一个catch
//5.可以进行 try-finally 配合使用, 这种用法相当于没有捕获异常， 因此程序会直接崩掉/退出。应用场景，就是执行一段代码，不管是否发生异常， 都必须执行某个业务逻辑

        try {
            int res=num11/num2;
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常原因= " +e.getMessage());//输出异常信息

        }finally {
            System.out.println("无论程序是否会发生异常，final内的语句都会被执行");
        }

    }
}
