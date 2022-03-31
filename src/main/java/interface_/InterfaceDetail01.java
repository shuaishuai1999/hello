package interface_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 10:30
 */


public class InterfaceDetail01 {
    //	1）接口不能被实例化
//    new a();
}


//注意事项和细节
//	1）接口不能被实例化
//	2）接口中所有的方法都是public方法，接口中的抽象方法，可以不用abstract修饰，因为接口自带抽象属性
//	3）一个普通类实现接口，就必须将该接口的所有方法都实现
//	4）抽象类实现接口，可以不用实现接口的方法
//	InterfaceDetail01.java

interface a{
    //接口中所有的方法都是public方法，可以不用abstract修饰
    void a1();
    void a2();
}

interface shark{

}


//	3）一个普通类实现接口，就必须将该接口的所有方法都实现
class b implements a,shark{

    @Override
    public void a1() {

    }

    @Override
    public void a2() {

    }
}

//	4）抽象类实现接口，可以不用实现接口的方法
abstract class c implements a{}

