package Chapter19.IO_.IO.Reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shuaishuai
 * @create 2022-04-25 20:31
 * @Version 1.0
 * @Description 演示使用 InputStreamReader 转换流解决中文乱码问题
 *  将字节流 FileInputStream 转成字符流 InputStreamReader, 指定编码 gbk/utf-8
 */

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath="src/main/java/Chapter19/IO_/IO/gb2312.txt";
        //解读
        //1.将 FileInputStream 转成 InputStreamReader
        //2.指定编码 gbk
//        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
        //3.把 InputStreamReader 传入 BufferedReader
//        BufferedReader br=new BufferedReader(isr);

        //将2和3 一起写
        BufferedReader br =new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath),"gbk"));

        //4.读取
        String s=br.readLine();
        System.out.println("读取到的内容："+s);
        //5.关闭外层流
        br.close();
    }
}
