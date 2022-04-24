package Chapter19.IO_.IO.InputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author shuaishuai
 * @create 2022-04-24 20:31
 * @Version 1.0
 * @Description
 */

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String FilePath="src/main/java/Chapter19/IO_/IO/OutputStream/ObjectOutputStreamSerializableFile.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FilePath));
        // 2.读取， 注意顺序
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
//        System.out.println(ois.readInt());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());

        //关闭
        ois.close();
        System.out.println("以反序列化的方式读取（恢复）OK ~");

    }
}
