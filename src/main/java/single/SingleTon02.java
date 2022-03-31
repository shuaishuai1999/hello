package single;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 21:41
 */
/*
 * 演示懒汉式的单例模式
 * */

public class SingleTon02 {
    public static void main(String[] args) {
//        new Cat("大华");
//        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);


        //如果再次调用getInstance，返回上一次的对象
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

        //两个实例相等
        System.out.println(instance==instance1);
    }
}


//希望在程序运行中，只能创建一个Cat对象
//使用单例模式
class Cat {
    private String name;
    public static int n1=999;
    private static Cat cat;
    //步骤
    //1、仍然构造私有化
    //2、定义一个static静态属性对象
    //3.提供一个public的static方法，返回Cat对象
    //4.懒汉式，只有当用户使用getInstance时，才返回Cat对象，后面再次调用时，会返回上一次的cat对象
    public Cat(String name) {
        this.name = name;
        System.out.println("构造器被调用");
    }
    public static Cat getInstance(){
        if(cat==null){
            cat=new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
