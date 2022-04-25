package Chapter19.IO_.IO.StandardIO;

import java.util.Scanner;

/**
 * @author shuaishuai
 * @create 2022-04-25 20:23
 * @Version 1.0
 * @Description 介绍标准输入与输出 system.in  system.out
 */

public class InputAndOutput {
    public static void main(String[] args) {
        //System类的public final static InputStream in = null;
        //System.in 编译类型 InputStream
        //System.in  运行类型  BufferedInputStream
        //表示的是输入  鼠标，键盘
        System.out.println(System.in.getClass());//class java.io.BufferedInputStream


        //1.System.out  public final static OutputStream in = null;
        //2.编译类型 PrintStream
        //3.运行类型 PrintStream
        //4.表示标准输出  显示器
        System.out.println(System.out.getClass());//class java.io.PrintStream

        System.out.println("请输入需打印内容：");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);
    }
}
