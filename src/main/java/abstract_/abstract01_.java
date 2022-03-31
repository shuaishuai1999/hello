package abstract_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-30 21:22
 */


public class abstract01_ {
    public static void main(String[] args) {

    }
}
//2）抽象类不一定要包含abstract方法
abstract class AA{

}
//一旦类包含了 abstract 方法,则这个类必须声明为 abstract
abstract class BB{

    public int n1=1;
    public static String name;
    //abstract 方法不能有主体
    abstract public void hi();
}

//abstract 只能修饰类和方法，不能修饰属性和其它的
class C{
//    此处不允许使用修饰符 'abstract'
//    public abstract int n1=1;
}

class DD extends BB{

    @Override
    public void hi() {

    }
}
