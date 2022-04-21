package Chapter16.TankBattle.TankGame;

/**
 * @author shuaishuai
 * @create 2022-04-19 15:28
 * @Version 1.0
 * @Description
 */

public class Tank {
    private int x; //坦克横坐标
    private int y;//坦克纵坐标

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
