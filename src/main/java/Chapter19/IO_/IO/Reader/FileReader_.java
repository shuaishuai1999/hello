package Chapter19.IO_.IO.Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author shuaishuai
 * @create 2022-04-21 17:25
 * @Version 1.0
 * @Description
 */

public class FileReader_ {
    public static void main(String[] args) {
        T3 t3 = new T3();
//        t3.readFile01();
        t3.readFile02();
    }
}
class T3{
    /**
     * 单个字符读取文件
     */
    public void readFile01(){
        String filePath="D:\\JDK\\JAVA学习\\IDEA_Files\\hello\\story.txt";
        FileReader fileReader=null;
        int data=0;
        //1.创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取，使用read,单个字符读取
            while ((data=fileReader.read())!=-1){
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 字符数组读取文件
     */
    public void readFile02(){
        System.out.println("~~~readFile02~~~");
        String filePath="D:\\JDK\\JAVA学习\\IDEA_Files\\hello\\story.txt";
        FileReader fileReader=null;


        int readLen=0;
        char[] buf = new char[8];
        //1.创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            ///循环读取 使用 read(buf), 返回的是实际读取到的字符数
            // 如果返回-1, 说明到文件结束
            while ((readLen=fileReader.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
     }
}
