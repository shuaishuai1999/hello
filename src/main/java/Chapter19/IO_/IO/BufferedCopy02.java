package Chapter19.IO_.IO;

import javax.naming.event.ObjectChangeListener;
import java.io.*;

/**
 * @author shuaishuai
 * @create 2022-04-24 17:51
 * @Version 1.0
 * @Description 使用BufferedInputStream 和 使用BufferedOutputStream 复制文件
 * 思考：字节流可以操作二进制文件，可以操作文本文件吗？当然可以
 */

public class BufferedCopy02 {
    public static void main(String[] args) {
        String srcFilePath = "src/main/java/Chapter19/IO_/IO/无名.mp3";
        String dstFilePath = "src/main/java/Chapter19/IO_/IO/无名copy.mp3";
//          String srcFilePath = "src/main/java/Chapter19/IO_/IO/ASCII码对照表.png";
//          String dstFilePath = "src/main/java/Chapter19/IO_/IO/ASCII码对照表1.png";//行
//        String srcFilePath = "src/main/java/Chapter19/IO_/IO/copy01test.txt";
//        String dstFilePath = "src/main/java/Chapter19/IO_/IO/copy03test.txt";//行


        //创建 BufferedOutputStream 对象 BufferedInputStream 对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(dstFilePath));

            byte[] buff = new byte[8];
            int readLen = 0;
            //循环读取文件
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff,0,readLen);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
