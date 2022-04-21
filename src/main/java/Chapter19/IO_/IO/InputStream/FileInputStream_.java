package Chapter19.IO_.IO.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author shuaishuai
 * @create 2022-04-21 15:00
 * @Version 1.0
 * @Description 演示FileInputStream 的使用
 */

public class FileInputStream_ {
    public static void main(String[] args) {
        T t = new T();
//        t.readFile01();
        t.readFile02();
    }
}

class T {
    /**
     * 演示读取文件。。。
     * 单个字节读取，效率比较低
     */
    public void readFile01() {
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream("D:\\JDK\\JAVA学习\\IDEA_Files\\hello\\test.txt");
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用 read(byte[] b)读取文件，提高效率
     */
    public void readFile02(){
        int readData = 0;
        byte[] buf=new byte[8];
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream("D:\\JDK\\JAVA学习\\IDEA_Files\\hello\\test.txt");
            //从该输入流读取最多b.length字节的数据到字节数组，此方法将阻塞，知道某些输入，
            //如果返回-1.表示读取完毕
            //如果读取正常，返回实际读取的字节数
            while ((readData = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0,readData));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     }
}
