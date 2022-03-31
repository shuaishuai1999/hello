package extend;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 14:43
 */


public class ExtendsDetail {
    public static void main(String[] args) {
        System.out.println("===新1个对象===");
        Sub sub = new Sub();
        System.out.println("===新2个对象===");
        Sub sub1 = new Sub("jack");
        System.out.println("===新3个对象===");
        Sub sub2 = new Sub("shuai",20);
        sub.sayOK();


    }
}
