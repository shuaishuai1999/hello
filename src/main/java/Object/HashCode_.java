package Object;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 16:56
 */


public class HashCode_ {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa1 = new AA();
        AA aa3=aa;
        //1.提供具有哈希结构的容器的效率
        //2.两个引用，如果指向的是同一个对象，则哈希值是一样的
        //3.两个引用，如果指向的是不同的对象，则哈希值不一样的
        //4.哈希值主要根据地址来计算的，但不能将哈希值等价于地址
        //5.在集合中，如果需要hashcode，需要重写

        System.out.println("aa.hashCode()"+aa.hashCode());
        System.out.println("aa1.hashCode()"+aa1.hashCode());
        System.out.println("aa3.hashCode()"+aa3.hashCode());
        //aa.hashCode()1163157884
        //aa1.hashCode()1956725890
        //aa3.hashCode()1163157884
    }
}
class AA{}
class BB extends AA{}
