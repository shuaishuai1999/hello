package Chapter21.InternetCoding.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shuaishuai
 * @create 2022-04-26 14:57
 * @Version 1.0
 * @Description  服务端  字符流
 *
 * 1.编写一个服务器端，和一个客户端
 * 2.服务器端在 9999 端口监听
 * 3.客户端连接到服务器端， 发送“hello,server" .然后退出
 * 4.服务端接收到 客户端发送的信息，输出，并退出
 */

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        // 1.服务器端在 9999 端口监听
        // 细节: 要求在本机没有其它服务在监听 9999
        // 细节：这个 ServerSocket 可以通过 accept() 返回多个 Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接");
        // 2.当没有客户端连接9999端口时，程序会阻塞，等待连接
        //如果有客户端连接，则会返回Socket对象。程序继续
        Socket socket = serverSocket.accept();

        System.out.println("服务端 socket="+socket.getClass());

        //3.通过socket.getInputStream() 读取客户端写入到数据通道的数据，显示
        InputStream inputStream = socket.getInputStream();

        //4.IO读取
        byte[] buff=new byte[1024];
        int readLen=0;
        while ((readLen=inputStream.read(buff))!=-1){
            System.out.println(new String(buff,0,readLen));//根据读取到的实际长度，显示内容
        }

        //5.关闭流和socket
        inputStream.close();
        socket.close();
        serverSocket.close();//关闭


    }
}
