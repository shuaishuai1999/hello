package Chapter19.IO_.IO.Writer;

import java.io.*;

/**
 * @author shuaishuai
 * @create 2022-04-25 21:05
 * @Version 1.0
 * @Description 演示 OutputStreamWriter 的使用
 */

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath="src/main/java/Chapter19/IO_/IO/gb2312.txt";
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(filePath),"gbk");
        osw.write("hello shuaishuai");
        osw.close();
        System.out.println("保存成功");
    }
}
