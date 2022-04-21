package Chapter16.TankBattle.BallMove;

import javax.swing.*;

/**
 * @author shuaishuai
 * @create 2022-04-19 15:55
 * @Version 1.0
 * @Description
 */

public class BallMove_ extends JFrame {//窗口
    MyPanel mp = null;

    public static void main(String[] args) {
        final BallMove_ ballMove_ = new BallMove_();
    }

    public BallMove_() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        //窗口JFrame 对象可以监听键盘事件，即可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

