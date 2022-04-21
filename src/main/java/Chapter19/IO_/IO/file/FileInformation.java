package Chapter19.IO_.IO.file;

import java.io.File;

/**
 * @author shuaishuai
 * @create 2022-04-21 14:29
 * @Version 1.0
 * @Description
 */

public class FileInformation {
    public static void main(String[] args) {
        T t = new T();
        t.info();
        t.Dir();
    }

}

class T {
    //获取文件信息
    public void info(){
        //先创建文件对象
        File file = new File("D:\\JDK\\JAVA学习\\IDEA_Files\\hello\\test.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        //output:
            //test.txt
            //D:\JDK\JAVA学习\IDEA_Files\hello\test.txt
            //D:\JDK\JAVA学习\IDEA_Files\hello
            //0
            //true
            //true
            //false
    }
    //目录的操作和文件删除
    public void Dir(){
        File file = new File("D:\\123");
        System.out.println(file.mkdir());//bool
        System.out.println(file.mkdirs());//bool
    }
}
