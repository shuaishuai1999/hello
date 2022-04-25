package Chapter19.IO_.IO;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author shuaishuai
 * @create 2022-04-25 20:46
 * @Version 1.0
 * @Description 演示PrintStream 使用方式
 */

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
//        public void print (String s){
//            if (s == null) {
//                s = "null";
//            }
//            write(s);
//            }
        out.print("john,hello");
        //因为 print 底层使用的是 write , 所以我们可以直接调用 write 进行打印/输出
        out.write("韩曙平，你好".getBytes());
        out.close();

        // 1. 输出修改成到 "e:\\f1.txt"
        // 2. "hello, 韩顺平教育~" 就会输出到 e:\f1.txt
        // 3. public static void setOut(PrintStream out)
        // { // checkIO(); // setOut0(out); // native 方法，修改了 out // }
        //我们可以去修改打印流输出的位置/设备
        System.setOut(new PrintStream("src/main/java/Chapter19/IO_/IO/PrintStream.txt"));
        System.out.println("hello ,韩顺平教育~");

    }
}
