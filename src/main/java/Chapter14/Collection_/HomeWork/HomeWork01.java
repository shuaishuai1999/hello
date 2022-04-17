package Chapter14.Collection_.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 21:18
 */


public class HomeWork01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        news news1 = new news("新冠确诊病例超千万，数百万印度教信徒赴恒河”圣浴“引民众担扰");
        news news2 = new news("男子突然想起2个月前钓的鱼还在往兜里，捞起一看赶紧放生");
        System.out.println(news1);
        System.out.println(news2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);

        Collections.reverse(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            news newstemp=(news) obj;
            if(newstemp.getTitle().length() >=15){
                String titletmp=newstemp.getTitle().substring(0,15)+"...";
                System.out.println(titletmp);
            }
        }
    }
}
class news{
    public String title;
    public String content;

    public news(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "news{" +
                "title='" + title  +
                '}';
    }
}
