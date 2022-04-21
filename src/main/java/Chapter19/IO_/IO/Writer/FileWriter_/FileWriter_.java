package Chapter19.IO_.IO.Writer.FileWriter_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author shuaishuai
 * @create 2022-04-21 17:37
 * @Version 1.0
 * @Description 使用 FileWriter 将 “风雨之后，定见彩虹” 写入到 note.txt 文件中, 注意细节.
 */

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath="D:\\JDK\\JAVA学习\\IDEA_Files\\hello\\note.txt";
        //创建FileWriter对象
        FileWriter fileWriter=null;
        char[] chars={'a','b','c'};
        try {
            fileWriter=new FileWriter(filePath);//默认写入是覆盖
//            fileWriter=new FileWriter(filePath,true);//默认写入是覆盖,加入true参数就是append
            // 3) write(int):写入单个字符
            fileWriter.write('H');
            // 4) write(char[]):写入指定数组
            fileWriter.write(chars);
            // 5) write(char[],off,len):写入指定数组的指定部分
            fileWriter.write("韩顺平教育".toCharArray(), 0, 3);
            // 6) write（string）：写入整个字符串
            fileWriter.write(" 你好北京~");
            fileWriter.write("风雨之后，定见彩虹");
            // 7) write(string,off,len):写入字符串的指定部分
            fileWriter.write("上海天津", 0, 2);

            //在数据量大的情况下，可以使用循环操作


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter!=null){
                try {
                    //对应 FileWriter , 一定要关闭流，或者 flush 才能真正的把数据写入到文件
                    // 老韩看源码就知道原因.
                    //fileWriter.flush();
                    // 关闭文件流，等价 flush() + 关闭
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("程序结束。。。");
    }
}

