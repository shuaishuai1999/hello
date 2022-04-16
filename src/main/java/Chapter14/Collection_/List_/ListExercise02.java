package Chapter14.Collection_.List_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 15:01
 */


public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
//         List list = new LinkedList();
//        List list = new Vector();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 19));
        list.add(new Book("三国", "罗贯中", 80)); //list.add(new Book("西游记", "吴承恩",
//        System.out.println(list);

        // 如何对集合进行排序

        //遍历
        for (Object obj:list){
            System.out.println(obj);
        }

        //冒泡排序
        sort(list);

        System.out.println("===排序后===");
        //遍历
        for (Object obj:list){
            System.out.println(obj);
        }
    }
    //静态方法
    //价格从小到大
    public static void sort(List list){
        int listSize= list.size();
        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < listSize-i-1; j++) {
                //取出对象Book
                Book bool1 =(Book)list.get(j);
                Book bool2 =(Book)list.get(j+1);
                if (bool1.getPrice()> bool2.getPrice()){
                       list.set(j,bool2);
                       list.set(j+1,bool1);
                }
            }
        }
    }


    static class Book {
        private String BookName;
        private String editor;
        private int price;

        @Override
        public String toString() {
            return "Book{" +
                    "BookName='" + BookName + '\'' +
                    ", editor='" + editor + '\'' +
                    ", price=" + price +
                    '}';
        }

        public Book(String bookName, String editor, int price) {
            BookName = bookName;
            this.editor = editor;
            this.price = price;
        }

        public String getBookName() {
            return BookName;
        }

        public void setBookName(String bookName) {
            BookName = bookName;
        }

        public String getEditor() {
            return editor;
        }

        public void setEditor(String editor) {
            this.editor = editor;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

}



