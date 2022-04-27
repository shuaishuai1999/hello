package Chapter21.InternetCoding.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author shuaishuai
 * @create 2022-04-26 15:28
 * @Version 1.0
 * @Description
 * 1.编写一个服务器端，和一个客户端
 * 2.服务器端在 9999 端口监听
 * 3.客户端连接到服务器端， 发送“hello,server" .并接收服务器端回发的”hello,client“ 再退出
 * 4.服务端接收到 客户端发送的信息，输出，并发送”hello,client" 再退出
 */

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        //思路
        // 1. 连接服务端 (ip , 端口）
        // 解读: 连接本机的 9999 端口, 如果连接成功，返回 Socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //2. 连接上后，生成 Socket, 通过 socket.getOutputStream()
        // 得到 和 socket 对象关联的输出流对象
        //3. 通过输出流，写入数据到 数据通道
        OutputStream outputStream = socket.getOutputStream();
        for (int i = 0; i < 10; i++) {
            outputStream.write("hello,小壁灯".getBytes());
            outputStream.write("\n".getBytes());
        }
        // 设置结束标记
        socket.shutdownOutput();
        //4. 获取和 socket 关联的输入流. 读取数据(字节)，并显示
        InputStream inputStream = socket.getInputStream();

        //5. 关闭流对象和 socket, 必须关闭
        byte[] buff=new byte[1024];
        int readLen=0;
        while ((readLen=inputStream.read())!=-1){
            System.out.println(new String(buff,0,readLen));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出... ");
    }
}
