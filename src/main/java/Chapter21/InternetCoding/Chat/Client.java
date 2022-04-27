package Chapter21.InternetCoding.Chat;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author shuaishuai
 * @create 2022-04-27 10:40
 * @Version 1.0
 * @Description
 */

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("连接服务器成功！如果想断开连接请输入88（回车）");
        new Thread(new myClientWriter(socket)).start();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        try {
            String msg;//服务器发过来的信息
            while ((msg = bufferedReader.readLine()) != null) {
                System.out.println("##服务器：" + msg);
            }
        } catch (IOException io) {
            System.out.println("警告：断开连接！");
            try {
                if (socket.isClosed()) {
                    socket.close();
                }
            } catch (IOException e) {
                System.out.println("读取线程：关闭socket出现错误");
            }
        }
        System.exit(1);
    }
}

class myClientWriter implements Runnable {
    private Socket socket=null;
    private PrintWriter printWriter;
    private Scanner scanner;

    public myClientWriter(Socket socket) throws IOException {
        this.socket = socket;
        scanner = new Scanner(System.in);
//        System.out.println("###客户端："+scanner);
        printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
    }

    @Override
    public void run() {
        String msg;//要发送的消息
        try {
            while ((msg = scanner.nextLine()) != null) {
//                System.out.println("isClosed=" + socket.isClosed());
                if (socket.isClosed()) {
                    break;
                } else {
                    if (msg.equals("88")) {
                        break;
                    }
                }
                printWriter.println(msg);
            }
        } catch (Exception e) {
//            printWriter.println("异常关闭客户端（可能是直接关闭窗口）");
        }
        System.out.println("写线程准备死亡");
    }
}
