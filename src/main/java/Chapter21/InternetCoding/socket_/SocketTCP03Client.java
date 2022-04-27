package Chapter21.InternetCoding.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author shuaishuai
 * @create 2022-04-26 16:00
 * @Version 1.0
 * @Description   使用字节流
 * * 1.编写一个服务器端，和一个客户端
 *  * 2.服务器端在 9999 端口监听
 *  * 3.客户端连接到服务器端， 发送“hello,server" .并接收服务器端回发的”hello,client“ 再退出
 *  * 4.服务端接收到 客户端发送的信息，输出，并发送”hello,client" 再退出
 */

public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        //关键一步：outputStream 字节流 转换为 BufferedWriter 字符流
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("hello ,server");
            bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，注意，要求对方使用readLine()!!!!
            bufferedWriter.flush();// 如果使用字符流，需要手动刷新，否则数据不会写入数据通道
        }

        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        //关键一步：将inputStream 字节流 转换为 BufferedReader 字符流
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();

    }
}
