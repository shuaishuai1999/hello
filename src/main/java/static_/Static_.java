package static_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 15:29
 */


public class Static_ {

    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);

        Stu marry = new Stu("marry");
        tom.payFee(200);
//        Stu.payFee(100);//直接用类名.类方法  直接调用


        //输出当前收到的总学费
        tom.showFee();//300
        marry.showFee();//300
        Stu.showFee();//300

    }
}

class  Stu{
    private String name;
    //静态变量
    private static double fee=0;

    public Stu(String name) {
        this.name = name;
    }

    public static void pri(){
        System.out.println("123");
    }

    //静态方法：静态方法可以访问静态属性
    public static void payFee(double fee){
        Stu.fee+=fee;
        System.out.println(Stu.fee);
//        this.name=name;//会出现报错，静态方法不能使用this 和 super 字段
        pri();//静态方法，访问静态方法
    }

    public static void showFee(){
        System.out.println("总学费有："+Stu.fee);
     }
}
