package Object;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 15:27
 */


public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b=a;
        A c=b;
        System.out.println(a==c);
        System.out.println(b==c);


        B bob = a;
//        bob=a;
        System.out.println(bob==c);

        //如果判断的是基本类型，则只判断值是否相等
        int num1=10;
        double num2=10.0;
        System.out.println(num1==num2);
        //带大家看看 Jdk 的源码 String 类的 equals 方法
        // 把 Object 的 equals 方法重写了,变成了比较两个字符串值是否相同
//        public boolean equals(Object anObject) {
//            if (this == anObject) {
//                return true;
//            }
//            if (anObject instanceof String) {
//                String anotherString = (String)anObject;
//                int n = value.length;
//                if (n == anotherString.value.length) {
//                    char v1[] = value;
//                    char v2[] = anotherString.value;
//                    int i = 0;
//                    while (n-- != 0) {
//                        if (v1[i] != v2[i])
//                            return false;
//                        i++;
//                    }
//                    return true;
//                }
//            }
//            return false;
//        }

        "hello".equals("abc");

        //Integer的equals
        //可以看到integer也重写了Object的equals方法，变成判断两个值相等
//        public boolean equals(Object obj) {
//            if (obj instanceof Integer) {
//                return value == ((Integer)obj).intValue();
//            }
//            return false;
//        }

        Integer integer1=new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true

        String abc = new String("abc");
        String abc1 = new String("abc");
        System.out.println(abc==abc1);//false 判断是否同一个对象和同一值
        System.out.println(abc.equals(abc1));//true  判断是否同一个值

        //Object的equals
        //即Object的equals方法默认就是比较对象地址是否相同
        //也就是判断两个对象是不是同一个对象
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }
    }

}
class B{}
class A extends B{}
