package enum_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-06 15:31
 */


public class EnumMethod {

    public static void main(String[] args) {
        //使用Season2 枚举类来 演示各种方法
        Season2 autumn = Season2.AUTUMN;

        //输出枚举对象的名字,与下面相同
        System.out.println(autumn.name());
        System.out.println(autumn.toString());
        // 3) ordinal：返回当前对象的位置号，默认从 0 开始
        System.out.println(autumn.ordinal());

        //从反编译可以看出 values 方法，返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        System.out.println("===遍历取出枚举对象（增强for）===");
       //快捷键：values.for 或者 iter
        //增强for循环
        for (Season2 value : values) { 
            System.out.println(value);
        }


        //5) valueOf：将字符串转换成枚举对象，要求字符串必须 为已有的常量名，否则报异常！
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1= "+autumn1);

        //6) compareTo：比较两个枚举常量，比较的就是编号！
        ///1. 就是把 Season2.AUTUMN 枚举对象的编号 和 Season2.SUMMER 枚举对象的编号比较
        // 2. 看看结果
        /*
        * public final int compareTo(E o) {
        *           return self.ordinal - other.ordinal;
        * }
        * Season2.AUTUMN 的编号[3] - Season2.SPRING 的编号[1]
        * */

        System.out.println(Season2.AUTUMN.compareTo(Season2.SPRING));



    }

}
//enum 常用方法应用实例:
//1) toString:Enum 类已经重写过了，返回的是当前对象 名,子类可以重写该方法，用于返回对象的属性信息
// 2) name：返回当前对象名（常量名），子类中不能重写
// 3) ordinal：返回当前对象的位置号，默认从 0 开始
// 4) values：返回当前枚举类中所有的常量
// 5) valueOf：将字符串转换成枚举对象，要求字符串必须 为已有的常量名，否则报异常！
// 6) compareTo：比较两个枚举常量，比较的就是编号！
// 7) 代码
