package Chapter21.InternetCoding.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author shuaishuai
 * @create 2022-04-26 16:25
 * @Version 1.0
 * @Description
 * * 1.编写一个服务器端，和一个客户端
 *  * 2.服务器端在 8888端口监听
 *  * 3.客户端连接服务端，发送 一张图片 e:\\qie.png
 *  * 4.服务器端接收到 客户端发送的 图片，保存到src下，发送“收到图片”再退出
 *  * 5.客户端收到服务的发送的“收到图片”，再退出
 *  * 6.该程序要求使用StreamUtils.java.我们直接使用
 */

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println(socket);

        String pngPath="src/main/java/Chapter21/InternetCoding/socket_/qq1.png";
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(pngPath));

        //bytes 就是pngPath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过 socket 获取到输出流, 将 bytes 数据发送给服务端
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        //=======接受从服务器端回复的消息========
        InputStream inputStream=socket.getInputStream();
        //使用 StreamUtils 的方法，直接将 inputStream 读取到的内容 转成字符串
        String s= StreamUtils.streamToString(inputStream);
        System.out.println(s);

        //关闭相关的流
        inputStream.close();
        bos.close();
        socket.close();




    }
}
