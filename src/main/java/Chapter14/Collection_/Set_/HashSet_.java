package Chapter14.Collection_.Set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 22:40
 */


public class HashSet_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //老韩解读
        //源码
        /*
        public HashSet() {
            map = new HashMap<>();
        }
        2.HashSet 可以存放 null ,但是只能有一个 null,即元素不能重复
        */
        Set set=new HashSet();
        set.add(null);
        set.add(null);
        System.out.println("set ="+ set);//set =[null]

    }
}
