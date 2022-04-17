package Chapter12.exception.Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-07 10:35
 */




public class Throws01 {


    public static void main(String[] args) {
        f2();
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void readFile() throws FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");

    }

    public static void f2() /*throws ArithmeticException*/{
        //1.对于编译异常，程序中必须处理，比如try-catch或者throws
        //2.对于运行时异常，程序如果没有做处理，默认就是throws的方式处理
        int n1=10;
        int n2=0;
        double res=n1/n2;
    }

    public static void f1() throws FileNotFoundException {
        //这里大家思考问题 调用 f3() 报错
        // 老韩解读
        // 1. 因为 f3() 方法抛出的是一个编译异常
        // 2. 即这时，就要 f1() 必须处理这个编译异常
        // 3. 在 f1() 中，要么 try-catch-finally ,或者继续 throws 这个编译异常
        f3();
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d://add.txt");
    }
    public static void f4(){
        //老韩解读:
        // 1. 在 f4()中调用方法 f5() 是 OK
        // 2. 原因是 f5() 抛出的是运行异常
        // 3. 而 java 中，并不要求程序员显示处理,因为有默认处理机制 f5()
        f5();
    }


    public static void f5() throws ArithmeticException{

    }
}
class Father{
    public void method() throws RuntimeException{

     }
}
class Son extends Father{
    //3. 子类重写父类的方法时，对抛出异常的规定:子类重写的方法，
    // 所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型
    // 4. 在 throws 过程中，如果有方法 try-catch , 就相当于处理异常，就可以不必 throws

    @Override
    public void method() throws ArithmeticException {
        super.method();
    }
}

