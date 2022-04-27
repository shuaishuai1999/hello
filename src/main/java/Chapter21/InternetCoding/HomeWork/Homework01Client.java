package Chapter21.InternetCoding.HomeWork;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author shuaishuai
 * @create 2022-04-26 22:35
 * @Version 1.0
 * @Description
 * 1.编程题Homework01.java
 * Homework01Server.java Homewo

 * (1)使用字符流的方式,编写一个客户端程序和服务器端程序,
 * (2)客户端发送"name",服务器端接收到后，返回“我是nova ", nova是你自己的名字
 * (3)客户端发送"hobby".服务器端接收到后，返回“编写java程序"
 * (4)不是这两个问题,回复“你说啥呢”
 * 问题:目前,我们只能问一次，就退出了，怎么可以问多次?->while->聊天
 */

public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 7777);
        System.out.println("客户端尝试连接~");
//        outputStream.write("name".getBytes());
//        System.out.println("客户端 ：name");





        //整一个输入框
        System.out.println("==========在线聊天系统==========");
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        OutputStream outputStream=null;
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
        while (!input.equals("q")){
            outputStream = socket.getOutputStream();
            System.out.print("客户端：");
            input=scanner.next();
            outputStream.write(input.getBytes());
        }
        outputStream.close();
        socket.shutdownOutput();



        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
        int dataLen=0;
        byte[] bytes = new byte[1024];
        while ((dataLen=inputStream.read(bytes))!=-1){
            System.out.println("服务器："+new String(bytes,0,dataLen));
        }


        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
    }
}
