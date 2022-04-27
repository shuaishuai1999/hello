package Chapter21.InternetCoding.Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author shuaishuai
 * @create 2022-04-27 10:40
 * @Version 1.0
 * @Description
 */


public class Server {
    public static final int SERVER_PORT=9999;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
        System.out.println("正在监听 "+SERVER_PORT+"端口！");
        Socket socket;
        BufferedReader bufferedReader;
        while (true){
            socket=serverSocket.accept();
            System.out.println("一客户端连接。");
            Thread writerThread=new Thread(new MyServerWriter(socket));
            writerThread.start();

            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            try {
                String msg;//客户端发过来的消息
                while ((msg=bufferedReader.readLine())!=null){
                    System.out.println("##客户端："+ msg);
                }
            }catch (IOException e){
                if (socket!=null){
                    try {
                        socket.close();
                    } catch (IOException ex) {
                        System.out.println("关闭socket出现错误");
                    }
                }
                System.out.println("提示：当前客户端已经断开来连接，服务器正等待下一个客户端连接。。");
            }
        }
    }

}
class MyServerWriter implements Runnable{
    private Socket socket=null;
    private PrintWriter printWriter;
    private Scanner scanner;

    public MyServerWriter(Socket socket) throws IOException {
        this.socket = socket;
        scanner=new Scanner(System.in);
//        System.out.println("###服务器："+scanner);
        printWriter=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
    }

    @Override
    public void run() {
        String msg;//要发送的信息
        try {
            while ((msg=scanner.nextLine())!=null){
                if(msg.equals("88")){
                    if(!socket.isClosed()){
                        System.out.println("服务器手动与客户端断开");
                        socket.close();
                    }
                    break;
                }
                printWriter.println(msg);
            }
        }catch (IOException io){
            printWriter.println("关闭socket出现问题");
        }finally {
            System.out.println("异常关闭客户端（可能是直接直接关闭退出窗口）");
        }
    }
}
