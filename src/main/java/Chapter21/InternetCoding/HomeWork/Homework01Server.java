package Chapter21.InternetCoding.HomeWork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author shuaishuai
 * @create 2022-04-26 22:34
 * @Version 1.0
 * @Description
 *
 * * (1)使用字符流的方式,编写一个客户端程序和服务器端程序,
 *  * (2)客户端发送"name",服务器端接收到后，返回“我是nova ", nova是你自己的名字
 *  * (3)客户端发送"hobby".服务器端接收到后，返回“编写java程序"
 *  * (4)不是这两个问题,回复“你说啥呢”
 *  * 问题:目前,我们只能问一次，就退出了，怎么可以问多次?->while->聊天
 */

public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("服务器正在监听 7777端口");
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);

        byte[] data=new byte[1024];
        int dataLen=0;
        while ((dataLen=bufferedInputStream.read(data))!=-1){
            System.out.println("客户端 ： "+new String(data,0,dataLen));
        }

//        outputStream.write("我是nova".getBytes());
//        System.out.println("服务器 ：我是nova");



        //整一个输入框
        System.out.println("==========在线聊天系统==========");
        Scanner scanner = new Scanner(System.in);
        String input = " ";
        OutputStream outputStream =null;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        while (!input.equals("q")){
             outputStream = accept.getOutputStream();
            System.out.print("服务器：");
            input=scanner.next();
            outputStream.write(input.getBytes());
        }
        accept.shutdownOutput();
        outputStream.close();




        bufferedInputStream.close();
        bufferedOutputStream.close();
        serverSocket.close();
    }
}
