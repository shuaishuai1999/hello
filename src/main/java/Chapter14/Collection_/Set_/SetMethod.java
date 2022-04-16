package Chapter14.Collection_.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 22:13
 */


public class SetMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //老韩解读
        //1. 以 Set 接口的实现类 HashSet 来讲解 Set 接口的方法
        // 2. set 接口的实现类的对象(Set 接口对象), 不能存放重复的元素, 可以添加一个 null
        // 3. set 接口对象存放数据是无序(即添加的顺序和取出的顺序不一致)
        // 4. 注意：取出的顺序的顺序虽然不是添加的顺序，但是他的固定
        Set set=new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);
        set.add(null);

        for (int i = 0; i < 10; i++) {
            System.out.println("set="+set);
        }


        //遍历
        //方式1：使用迭代器
        System.out.println("===迭代器===");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        //2.增强for
        System.out.println("===增强for===");
        for (Object o : set) {
            System.out.println(o);
        }

        //set 接口对象，不能通过索引来获取
    }
}
