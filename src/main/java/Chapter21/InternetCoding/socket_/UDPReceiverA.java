package Chapter21.InternetCoding.socket_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author shuaishuai
 * @create 2022-04-26 21:53
 * @Version 1.0
 * @Description  UDP 网络通信编程
 *
 * 1.编写一个接收端A, 和一个发送端
 * 2.接收端A在 9999 端口等待接受数据（receive）
 * 3.发送端B向接受端A 发送数据 “hello,明天吃火锅~”
 * 4.接收端A接收到 发送端B发送的数据，回复“好的，明天见”，再退出
 * 5.发送端接受回复的数据，再退出
 */

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个 DatagramSocket 对象，准备在 9999 接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //2. 构建一个 DatagramPacket 对象，准备接收数据
        // 在前面讲解 UDP 协议时，老师说过一个数据包最大 64k
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        //3. 调用 接收方法, 将通过网络传输的 DatagramPacket 对象
        // 填充到 packet 对象
        // 老师提示: 当有数据包发送到 本机的 9999 端口时，就会接收到数据
        // 如果没有数据包发送到 本机的 9999 端口, 就会阻塞等待.

        //4. 可以把 packet 进行拆包，取出数据，并显示
        datagramSocket.receive(packet);
        System.out.println(new String(packet.getData(), 0, packet.getLength()));

        //===回复信息给 B 端 //将需要发送的数据，封装到 DatagramPacket 对象
        byte[] data="好的，明天见".getBytes();
        //说明: 封装的 DatagramPacket 对象 data 内容字节数组 , data.length , 主机(IP) , 端口
        packet=new DatagramPacket(data, data.length, InetAddress.getLocalHost(),9998);
        datagramSocket.send(packet);


        datagramSocket.close();
        System.out.println("接收端A 结束");
    }
}
