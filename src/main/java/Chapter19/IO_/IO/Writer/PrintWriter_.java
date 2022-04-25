package Chapter19.IO_.IO.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author shuaishuai
 * @create 2022-04-25 21:09
 * @Version 1.0
 * @Description 演示 PrintWriter 的使用
 */

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter filepath = new PrintWriter(new FileWriter("filepath"));
    }
}
