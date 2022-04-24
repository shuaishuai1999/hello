package Chapter19.IO_.IO.Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author shuaishuai
 * @create 2022-04-24 17:21
 * @Version 1.0
 * @Description 演示BufferedWriter_、的使用
 */
//D:\JDK\JAVA学习\IDEA_Files\hello\src\main\java\Chapter19\IO_\IO\Writer\BufferedWriter_.java
//D:\JDK\JAVA学习\IDEA_Files\hello\src\main\java\Chapter19\IO_\IO\ReaderAndWriter.txt
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath="D:\\JDK\\JAVA学习\\IDEA_Files\\hello\\src\\main\\java\\Chapter19\\IO_\\IO\\ReaderAndWriter.txt";
        //创建BufferedWriter
        //说明:
        // 1. new FileWriter(filePath, true) 表示以追加的方式写入
        // 2. new FileWriter(filePath) , 表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello,韩顺平教育！");
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("hello,韩顺平教育！");
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("hello,韩顺平教育！");
        bufferedWriter.newLine();//插入一个和系统相关的换行

        //说明：关闭外层流即可 ， 传入的 new FileWriter(filePath) ,会在底层关闭
        bufferedWriter.close();
    }
}
