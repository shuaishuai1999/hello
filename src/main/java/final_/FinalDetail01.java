package final_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 22:15
 */


public class FinalDetail01 {
    public static void main(String[] args) {
        //4）final类不能继承，但是可以实例化对象
        CC cc = new CC();
    }
}
class AA{
    /*
    * 2）final修饰的属性在定义时，必须赋初值，并且以后不能再修改，赋值可以在如下位置之一
	①定义时
	②在构造器中
	③在代码块中*/

    //	①定义时
    public final double TAX_RATE=0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {//②在构造器中
//        this.TAX_RATE2 = TAX_RATE2;
        TAX_RATE2=1.1;
    }
    {
       //③在代码块中*/
        TAX_RATE3=8.8;
    }
}
class BB{
    /*
    * 3）如果final修饰的属性是静态的，则初始化的位置只能是
	①定义时
	②在静态代码块中
    * */

    //	①定义时
    public static final double TAX_RATE=0.08;
    public static final double TAX_RATE2;

    static {
        TAX_RATE2=3.3;
    }

}

//4）final类不能继承，但是可以实例化对象

final class CC{}


//5.如果类不是final类，但是含有final方法， 则该方法不能重写，但是可以被继承
class DD{
    public final void final_method(){

    }
}

class EE extends DD{
    //'final_method()' 无法重写 'final_.DD' 中的 'final_method()'；重写的方法为 final
//    public void final_method(){

//    }
}
