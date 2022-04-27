package Chapter21.InternetCoding.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shuaishuai
 * @create 2022-04-26 15:57
 * @Version 1.0
 * @Description 使用字符流
 * 1.编写一个服务器端，和一个客户端
 * 2.服务器端在 9999 端口监听
 * 3.客户端连接到服务器端， 发送“hello,server" .并接收服务器端回发的”hello,client“ 再退出
 * 4.服务端接收到 客户端发送的信息，输出，并发送”hello,client" 再退出
 */

public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器开始监听 9999端口~");
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        //关键一步：将inputStream 字节流 转换为 BufferedReader 字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        OutputStream outputStream = accept.getOutputStream();
        //关键一步：outputStream 字节流 转换为 BufferedWriter 字符流
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));

        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("hello client");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedReader.close();
        bufferedWriter.close();
        accept.close();
        serverSocket.close();

    }
}
