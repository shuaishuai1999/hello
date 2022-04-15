package Chapter13.WrapperType.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-13 9:50
 */


public class ArrayExercise {
    public static void main(String[] args) {
        /*
        案例：自定义 Book 类，里面包含 name 和 price，按 price 排序(从大到小)。
        要求使用两种方式排序 , 有一个 Book[] books = 4 本书对象.

        使用前面学习过的传递 实现 Comparator 接口匿名内部类，也称为定制排序。
        [同学们完成这个即可 10min ],
        可以按照 price (1)从大到小 (2)从小到大 (3) 按照书名长度从大到小
        */

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦啊", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘 20 年", 5);
        books[3] = new Book("java 从入门到放弃~", 300);


//        //1.按照 price (1)从大到小
//        Arrays.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book) o1;
//                Book book2 = (Book) o2;
//                double priceVal=book2.getPrice()-book1.getPrice();
//                //这里老师进行了一个转换 //
//                // 如果发现返回结果和我们输出的不一致，就修改一下返回的 1 和 -1
//                if (priceVal>0){
//                    return 1;
//                }else if (priceVal<0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(Arrays.toString(books));



        //2.按照 price (1)从小到大
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                //只要将，book2.getPrice()-book1.getPrice() 改为book1.getPrice()-book2.getPrice() 就行
                double priceVal=book1.getPrice()-book2.getPrice();
                //这里老师进行了一个转换 //
                // 如果发现返回结果和我们输出的不一致，就修改一下返回的 1 和 -1
                if (priceVal>0){
                    return 1;
                }else if (priceVal<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println("===从小到大排序===");
        System.out.println(Arrays.toString(books));



        //2.按照 书名长度 排序
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return book2.getName().length()-book1.getName().length();
            }
        });
        System.out.println("===从小到大排序===");
        System.out.println(Arrays.toString(books));

    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
