package Chapter14.Collection_.Set_;

import java.util.HashSet;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 22:42
 */


public class HashSet01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        //说明
        //1.在执行add方法后，会返回一个Boolean值
        //2.如果添加成功，返回true ，否则返回 false
        //3.可以通过 remove 指定删除哪个对象
        System.out.println(hashSet.add("johb"));//T
        System.out.println(hashSet.add("lucy"));//T
        System.out.println(hashSet.add("john"));//T
        System.out.println(hashSet.add("jack"));//T
        System.out.println(hashSet.add("Rose"));//T
        System.out.println(hashSet.add("johb"));//F

        hashSet.remove("johb");
        System.out.println("hashSet =" + hashSet);

        //4 Hashset 不能添加相同的元素/数据?
        hashSet.add("jack");
        System.out.println(hashSet);

        HashSet hashSet1 = new HashSet();
        hashSet1.add(new Dog("tom"));
        hashSet1.add(new Dog("tom"));
        System.out.println("set =" + hashSet1 );

        //经典面试题
        // String 对象重写了 equlas 方法
        hashSet.add(new String("hsp"));
        hashSet.add(new String("hsp"));//加入不了
        System.out.println("hashSet = "+ hashSet);

    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
