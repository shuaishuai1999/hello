package codeBlock;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 16:55
 */


public class CodeBlockDetail01 {
    public static void main(String[] args) {
//    2）
//    类什么时候被加载（重要）
//    ①创建对象实例时（new）
        AA aa = new AA(); //BB 的静态代码1被执行... AA 的静态代码1被执行...
//        BB bb = new BB();//BB 的静态代码1被执行...
//    ②创建子类对象实例，父类也会被加载
        AA aa1 = new AA(); //BB 的静态代码1被执行... AA 的静态代码1被执行...
//    ③使用类的静态成员时（静态属性，静态方法）
        ////static 代码块，是在类加载时，执行的，而且只会执行一次.
        int i=DD.n1;//DD 的静态代码1被执行...


        //每创建一个对象， 调用一次
        DD dd = new DD();//DD 的普通代码块...
        DD dd1 = new DD();//DD 的普通代码块...

        Cat cat = new Cat();//999  Cat 的静态代码1被执行...
        Animal animal = new Animal();// 连着上面只执行了一次  Animal 的静态 代码块1被执行...999 Cat 的静态代码1被执行...


    }
}

class DD{
    public static int n1=8888;//静态属性
    //静态代码块
    static {
        System.out.println("DD 的静态代码1被执行...");
    }

    //普通代码块，在new对象时，被 调用，而且是每创建一个对象， 调用一次
    //可以这样简单的，理解  普通代码块是构造器的补充
    {
        System.out.println("DD 的普通代码块...");
    }
}

class Animal{

    static {
        System.out.println("Animal 的静态 代码块1被执行...");
    }
}

class Cat extends Animal{
    public static int n1=999;//静态属性
    //静态代码块
    static {
        System.out.println(n1);
        System.out.println("Cat 的静态代码1被执行...");
    }
}

class BB{
    //静态代码块
    static {
        System.out.println("BB 的静态代码1被执行...");//1
    }
}

class AA extends BB{
    //静态代码块
    static {
        System.out.println("AA 的静态代码1被执行...");//2
    }
}
