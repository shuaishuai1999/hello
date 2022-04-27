package Chapter21.InternetCoding.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shuaishuai
 * @create 2022-04-26 16:24
 * @Version 1.0
 * @Description
 * 1.编写一个服务器端，和一个客户端
 * 2.服务器端在 8888端口监听
 * 3.客户端连接服务端，发送 一张图片 e:\\qie.png
 * 4.服务器端接收到 客户端发送的 图片，保存到src下，发送“收到图片”再退出
 * 5.客户端收到服务的发送的“收到图片”，再退出
 * 6.该程序要求使用StreamUtils.java.我们直接使用
 *
 * 思路
 * 1、将接受的inputStream  转为 BufferedInputStream
 * 2. 然后将 bufferedInputStream 内容转为 bytes
 * 3、将 bytes写入文件
 */

public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        //1.监听
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器正在监听 8888 端口~");

        //2.等待连接
        Socket accept = serverSocket.accept();

        //3.读取客户端发送的数据
        // 通过Socket 得到输入流 输入流转换为数组
        BufferedInputStream bis=new BufferedInputStream(accept.getInputStream());
        byte[] bytes=StreamUtils.streamToByteArray(bis);

        //4.将得到 bytes数组，写入到指定的路径，就得到一个文件了

        String desfilePath="src/main/java/Chapter21/InternetCoding/socket_/qq1_copy.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desfilePath));
        bos.write(bytes);
        bos.close();


        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter1.write("服务器收到图片");
        bufferedWriter1.flush();//把内容刷新到数据通道
        accept.shutdownOutput();

        //关闭其他资源
        bis.close();
        bos.close();
        accept.close();
        serverSocket.close();



    }
}
