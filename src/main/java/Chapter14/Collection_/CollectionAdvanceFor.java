package Chapter14.Collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-14 17:25
 */


public class CollectionAdvanceFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book2("三国演义","罗贯中",10.1));
        collection.add(new Book2("小李飞刀","古龙",5.1));
        collection.add(new Book2("红楼梦","曹雪芹",34.6));


        for(Object obj : collection){
            System.out.println("obj =" + obj);
        }

    }
}
class Book2{
    private String bookName;
    private String editor;
    private double price;

    public Book2(String bookName, String editor, double price) {
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
