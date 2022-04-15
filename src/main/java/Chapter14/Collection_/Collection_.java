package Chapter14.Collection_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-14 14:53
 */


public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        Collection
//        Map
        //老韩解读
        //1.集合主要是两组（单列集合，双列集合）
        //2、Collection 接口有两个重要的子接口 List Set， 他们的实现子类都是单列集合
        //3.Map 接口实现子类  是双列集合，存放  K-V  key-value
        //4.把老师梳理的两张图记住

        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");

        HashMap hashMap = new HashMap();
        hashMap.put("01","北京");
        hashMap.put("02","金溪");


    }
}
