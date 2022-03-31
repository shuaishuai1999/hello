package single;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 20:16
 */


public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend xhh = new GirlFriend("小屡屡");

        //通过方法获取对象
//        GirlFriend instance = GirlFriend.getInstance();
//        System.out.println(xhh);
        System.out.println(GirlFriend.n1);
    }
}


//有一个类， GrilFriend
//只能有一个女朋友
class GirlFriend{
    private String name;
    public static int n1=100;

    //有可能该对象没有使用，但是该静态变量已被创建，所以称为饿汉式
    //饿汉式可能导致创建了对象，但是未被使用，导致资源浪费
    private static GirlFriend gf=new GirlFriend("小红红");

    //如何保障我们只能创建一个GirlFriend对象
    //步骤 【单例模式--饿汉式】
    //1.将构造器私有化
    //2.在类的内部直接创建对象（该对象是static）
    //3.提供一个公共的static方法， 返回 gf 对象
    public GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
