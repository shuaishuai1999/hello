package Chapter16.TankBattle.Draw_;

import javax.swing.*;
import java.awt.*;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-19 10:50
 */


public class DrawCircle extends JFrame {
    private MyPanel mp =null;
    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序~");
    }

    public DrawCircle() {//构造器
        //初始化面板
        mp=new MyPanel();
        //把画板放入到窗口（画框）
        this.add(mp);
        //设置窗口的大小
        this.setSize(1600,1600);
        //当点击窗口X，程序完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以展示
    }
}



// 先定义一个画板myPannel,继承JPanel类，画图形，就在面板上画
class MyPanel extends JPanel {

    //说明：
    //1.MyPanel 对象就是一个画板
    //2.Graphics类是所有图形上下文的抽象基类，允许应用程序绘制在各种设备上实现的组件，以及屏幕上的图像。
    //2. Graphics g 把 g 理解成一支画笔
    //3. Graphics 提供了很多绘图的方法
    @Override
    public void paint(Graphics g) {//绘图方法

        super.paint(g);//调用父类的方法完成初始化
        System.out.println("paint 方法被调用了");
        //画一个圆形
//        g.drawOval(10,10,100,100);

//        //演示绘制不同的图形..
//         画直线 drawLine(int x1,int y1,int x2,int y2)
        g.drawLine(10, 10, 100, 100);
//
//        //画矩形边框 drawRect(int x, int y, int width, int height)
//        g.drawRect(10, 10, 100, 100);
//
//        //画椭圆边框 drawOval(int x, int y, int width, int height)
//        // 填充矩形 fillRect(int x, int y, int width, int height)
//        // 设置画笔的颜色
        g.setColor(Color.blue);
         g.fillRect(10, 10, 100, 100);
//
//         //填充椭圆 fillOval(int x, int y, int width, int height)
//        g.setColor(Color.red);
//         g.fillOval(10, 10, 100, 100);
//        // 画图片 drawImage(Image img, int x, int y, ..)
//        // 1. 获取图片资源, /bg.png 表示在该项目的根目录去获取 bg.png 图片资源
//        // Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
//        // g.drawImage(image, 10, 10, 175, 221, this);
//        // 画字符串 drawString(String str, int x, int y)
//        //
//        // 写字
//        // 给画笔设置颜色和字体 g.setColor(Color.red);
         g.setFont(new Font("隶书", Font.BOLD, 50));
//        //
//        // 这里设置的 100， 100， 是 "北京你好"左下角
        g.drawString("北京你好", 100, 100);

        //设置画笔的字体 setFont(Font font)
        // 设置画笔的颜色 setColor(Color c)
    }
}
