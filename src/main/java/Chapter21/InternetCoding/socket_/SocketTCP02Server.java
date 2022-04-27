package Chapter21.InternetCoding.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shuaishuai
 * @create 2022-04-26 15:25
 * @Version 1.0
 * @Description  使用字节流 ： 服务器输出到客户端会出现乱码
 *  1.编写一个服务器端，和一个客户端
 *  2.服务器端在 9999 端口监听
 *  3.客户端连接到服务器端， 发送“hello,server" .并接收服务器端回发的”hello,client“ 再退出
 *  4.服务端接收到 客户端发送的信息，输出，并发送”hello,client" 再退出
 *
 */

public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器正在监听 9999端口...");

        Socket accept = serverSocket.accept();


        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello,client".getBytes());


        //设置结束标记
        accept.shutdownOutput();

        InputStream inputStream = accept.getInputStream();
        byte[] buff=new byte[1024];
        int readLen=0;
        while ((readLen=inputStream.read(buff))!=-1){
            System.out.println(new String(buff,0,readLen));
        }

        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
        System.out.println("服务端端口已关闭");

    }
}
