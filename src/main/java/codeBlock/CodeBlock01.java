package codeBlock;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 16:36
 */


public class CodeBlock01 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        //过于冗余了，所以直接将以下输出在代码块中处理
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");

        Movie movie = new Movie("你好，李焕英");

        //冗余
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        System.out.println("===================");
        Movie movie1 = new Movie("唐探3", 100, "陈思诚");
    }
}

class Movie{
    private String name;
    private double price;
    private String director;

    //3个构造器 -》 重载
    //（1）下面的三个构造器都有相同的语句
    //（2）这样代码看起来比较冗余
    //（3）这时我们可以把相同的语句，放入到一个代码中。
    //（4）这样当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
    //（5）代码块调用的顺序优先于构造器

    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    };

    public Movie(String name) {
        System.out.println("Movie(String name)被调用...");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("ovie(String name, double price, String director)被调用...");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
