package interface_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 10:56
 */


public class ExtendsVSInterface {
    public static void main(String[] args) {
        Monkey dog = new Monkey("小狗");
        dog.climbing();

        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.swimming();
        littleMonkey.climbing();
        littleMonkey.flying();

    }
}


class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }
    public void climbing(){
        System.out.println(name+"会爬树...");
    }

    public String getName() {
        return name;
    }
}

//接口
interface Fishable{
    void swimming();
}
interface Birdable{
    void flying();
}


//继承
//小结：当子类继承了父类，就自动的拥有父类的功能
//  如果子类需要扩展功能，可以通过实现接口的方式扩展
//  可以理解，实现接口  是对 java但继承机制的一种补充

class LittleMonkey extends Monkey implements Fishable,Birdable{

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习，可以像鱼儿一样游泳...");
    }

    @Override
    public void flying() {
        System.out.println(getName()+"通过学习，可以像鸟儿一样飞翔...");

    }
}
