package interface_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 10:51
 */


public class InterfaceDetail02 {
    public static void main(String[] args) {
//        C c = new C();
        //7）接口中属性的访问形式：接口名.属性名
        System.out.println(inter2.n1);
    }

}
//5) 一个类同时可以实现多个接口
//6）接口中的属性，只能是final的，而且是public static final修饰符
//7）接口中属性的访问形式：接口名.属性名
//8）接口不能继承其他类，但是可以继承多个别的接口
//9）接口的修饰符，只是public和默认，这点和类的修饰符是一样的
interface inter1 {}
interface inter3{}

interface inter2{
   public static final int n1=100;
}
//5) 一个类同时可以实现多个接口
class C implements inter1,inter2{
//    inter2.n1;
}

