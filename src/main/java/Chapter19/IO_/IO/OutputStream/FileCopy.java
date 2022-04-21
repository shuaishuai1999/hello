package Chapter19.IO_.IO.OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author shuaishuai
 * @create 2022-04-21 16:12
 * @Version 1.0
 * @Description 文件拷贝
 */

public class FileCopy {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.FileCopy01();
    }
}
class T1{

    /**
     *完成 文件拷贝，
     * 将 e:\\Koala.jpg 拷贝 c:\\
     * //思路分析
     * //1. 创建文件的输入流 , 将文件读入到程序
     * //2. 创建文件的输出流， 将读取到的文件数据，写入到指定的文件
     * //3. 在完成程序时，应该是读取部分数据，就写入到指定文件，这里使用循环
     */
    public void FileCopy01(){
        String srcFilepath="C:\\Users\\shuaishuai\\Pictures\\01\\1.png";
        String desFilepath="C:\\Users\\shuaishuai\\Pictures\\01\\11.png";
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;

        try {
            fileInputStream=new FileInputStream(srcFilepath);
            fileOutputStream=new FileOutputStream(desFilepath);

            //定义一个字节数组，提高读取效果
            byte[] buf = new byte[1024];
            int readLen=0;
            while ((readLen=fileInputStream.read(buf))!=-1){
                //读取到后，就写入文件 FileOutputStream
                //即边读边写
                fileOutputStream.write(buf,0,1024);//一定要使用这个方法

            }
            System.out.println("拷贝成功");


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream!=null){
                try {

                    //关闭输入流，输出流，释放资源
                    fileInputStream.close();
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
