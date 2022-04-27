package Chapter21.InternetCoding.socket_;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author shuaishuai
 * @create 2022-04-26 15:14
 * @Version 1.0
 * @Description
 * 客户端，发送 "hello, server" 给服务端
 */

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //思路
        //1.连接服务器（ip,端口）
        //解读：连接本机的9999 端口，如果连接成功，返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket="+socket.getClass());

        //2.连接上后，生成Socket，通过socket.getOutputStream()
        //  得到 和 socket 对象关联的输出对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到，数据通道
        outputStream.write("hello,server".getBytes());
        //4.关闭流对象和socket,必须关闭
        outputStream.close();
        socket.close();
    }

}
