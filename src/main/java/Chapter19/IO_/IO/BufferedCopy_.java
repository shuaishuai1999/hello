package Chapter19.IO_.IO;

import java.io.*;

/**
 * @author shuaishuai
 * @create 2022-04-24 17:44
 * @Version 1.0
 * @Description 使用BufferReader 和 BufferedWriter 复制文件
 */

public class BufferedCopy_ {
    public static void main(String[] args) {
        //老韩说明
        // 1. BufferedReader 和 BufferedWriter 是安装字符操作
        // 2. 不要去操作 二进制文件[声音，视频，doc, pdf ], 可能造成文件损坏
        // BufferedInputStream
        // BufferedOutputStream
//        String srcFilePath = "src/main/java/Chapter19/IO_/IO/无名.mp3";
//        String dstFilePath = "src/main/java/Chapter19/IO_/IO/无名copy1.mp3";//补丁
        String srcFilePath = "src/main/java/Chapter19/IO_/IO/copy01test.txt";
        String dstFilePath = "src/main/java/Chapter19/IO_/IO/copy02test.txt";
//        String srcFilePath = "src/main/java/Chapter19/IO_/IO/ASCII码对照表.png";
//        String dstFilePath = "src/main/java/Chapter19/IO_/IO/ASCII码对照表1.png";//不行


        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(dstFilePath));

            //说明: readLine 读取一行内容，但是没有换行
            while ((line = br.readLine()) != null) {
                //每读取一行，就写入
                bw.write(line);
                //插入一行
                bw.newLine();
            }
            System.out.println("拷贝完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
