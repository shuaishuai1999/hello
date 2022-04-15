package Chapter14.Collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-14 17:10
 */


public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book1("三国演义","罗贯中",10.1));
        collection.add(new Book1("小李飞刀","古龙",5.1));
        collection.add(new Book1("红楼梦","曹雪芹",34.6));

        System.out.println("collection =" + collection.toString());//collection =[Chapter14.Collection_.Book1@4554617c, Chapter14.Collection_.Book1@74a14482, Chapter14.Collection_.Book1@1540e19d]

        //现在老师希望能够遍历collection集合
        //1.先 得到 collection的迭代器
        Iterator iterator = collection.iterator();
        //2.使用while循环遍历
        //while (iterator.hasNext()) {
        // 判断是否还有数据 //
        // 返回下一个元素，类型是 Object
        // Object obj = iterator.next();
        // System.out.println("obj=" + obj);
        // }
        // 老师教大家一个快捷键，快速生成 while => itit
        // 显示所有的快捷键的的快捷键 ctrl + j

        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj = "+ obj);
        }

        //3. 当退出 while 循环后， 这时 iterator 迭代器，指向最后的元素
//        iterator.next();//NoSuchElementException
        //4. 如果希望再次遍历，需要重置我们的迭代器
         iterator= collection.iterator();
        System.out.println("===第二次遍历===");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj ="+obj);
        }

    }


}
class Book1{
    private String bookName;
    private String editor;
    private double price;

    public Book1(String bookName, String editor, double price) {
        this.bookName = bookName;
        this.editor = editor;
        this.price = price;
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "bookName='" + bookName + '\'' +
                ", editor='" + editor + '\'' +
                ", price=" + price +
                '}';
    }
}

