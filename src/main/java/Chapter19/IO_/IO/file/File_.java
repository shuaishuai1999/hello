package Chapter19.IO_.IO.file;

import java.io.File;
import java.io.IOException;

/**
 * @author shuaishuai
 * @create 2022-04-21 11:16
 * @Version 1.0
 * @Description 文件操作
 */

public class File_ {
    public static void main(String[] args) {
        //方式一 new File(String pathname)
        File file = new File("test.txt");//创建一个file对象
        try {
            file.createNewFile();//真正创建文件
            System.out.println("创建"+file.getName()+"成功");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
    //方式二 new File(File parent,String child) //根据父目录文件+子路径构建
    //e:\\news2.txt
    public void Created02(){
        File parentFile = new File("e:\\");
        String filename="news02.txt";
        //这里的 file 对象，在 java 程序中，只是一个对象
        // 只有执行了 createNewFile 方法，才会真正的，在磁盘创建该文件
        File file = new File(parentFile, filename);
        try {
            file.createNewFile();
            System.out.println("创建"+filename+"成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式 3 new File(String parent,String child) //根据父目录+子路径构建
    public void create03(){
        String parentPath="e:\\";
        String filename="news03.txt";
        File file = new File(parentPath, filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// 下面四个是抽象类
//  InputStream
//  OutputStream
//  Reader  字符输入流
//  Writer  字符输出流
