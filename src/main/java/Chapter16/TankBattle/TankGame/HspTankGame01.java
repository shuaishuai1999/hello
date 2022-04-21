package Chapter16.TankBattle.TankGame;

import javax.swing.*;

/**
 * @author shuaishuai
 * @create 2022-04-19 15:32
 * @Version 1.0
 * @Description
 */

public class HspTankGame01 extends JFrame {
    //定义myPanel
    myPanel myPanel=null;
    public static void main(String[] args) {
        HspTankGame01 hspTankGame01 = new HspTankGame01();
    }

    public HspTankGame01() {
        myPanel=new myPanel();
        this.add(myPanel);//把画板（就是游戏的绘图区域）加进去
        this.setSize(1600,1600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

