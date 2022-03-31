package final_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 21:54
 */


public class Final01 {
    public static void main(String[] args) {
        E e = new E();
//        e.TAX_RATE=0.09;//无法将值赋给 final 变量 'TAX_RATE'
    }
}

//如果我们要求A类不能被其他类继承
//可以使用final修饰A类
final class A{}

//class B extends A{}//无法从final 'final_.A' 继承

class C{
    //如果我们要求hi不能被子类重写
    //可以使用final修饰hi方法
    public final void hi(){

    }
}

class D extends C{
//    public void hi(){//hi()' 无法重写 'final_.C' 中的 'hi()'；重写的方法为 final
}

//当不希望类的某个属性的值被修改，可以用final装饰
class E{
    public final double TAX_RATE=0.08;//常量
}

//当不希望类的某个局部变量被修改，可以用final装饰
class F{
    public void cry(){

        //这时，NUM为局部变量
        final double NUM=0.01;
        System.out.println("NUM="+NUM);
    }
}
