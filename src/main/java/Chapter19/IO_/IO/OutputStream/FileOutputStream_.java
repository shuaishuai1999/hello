package Chapter19.IO_.IO.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author shuaishuai
 * @create 2022-04-21 15:42
 * @Version 1.0
 * @Description  FileOutputStream_功能演示
 */

public class FileOutputStream_ {
    public static void main(String[] args) {
        T t = new T();
        t.OutputFile();
    }
}
class T{
    /**
     * 使用FileOutputStream 输出“hello,shuai" 到文件
     * 如果文件不存在，则创建文件（注意：前提，目录存在）
     */
    public void OutputFile(){
        FileOutputStream fileOutputStream=null;
        String filePath="D:\\JDK\\JAVA学习\\IDEA_Files\\hello\\test.txt";
        String out="hello,shuai1";
        try {
            //得到 FileOutputStream 对象 对象
            // 老师说明
            // 1. new FileOutputStream(filePath) 创建方式，当写入内容是，会覆盖原来的内容
            // 2. new FileOutputStream(filePath, true) 创建方式，当写入内容是，是追加到文件后面
            fileOutputStream=new FileOutputStream(filePath,true);
            //使用此方式，会覆盖原先的内容
            fileOutputStream.write("\n".getBytes());
            fileOutputStream.write(out.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
