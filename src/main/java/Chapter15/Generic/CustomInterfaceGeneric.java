package Chapter15.Generic;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 16:09
 */


public class CustomInterfaceGeneric {
    public static void main(String[] args) {
        /* 泛型接口使用的说明 *
         1. 接口中，静态成员也不能使用泛型
         2. 泛型接口的类型, 在继承接口或者实现接口时确定
         3. 没有指定类型，默认为 Object
         */
    }
}

//在继承接口 指定泛型接口的类型
interface IA extends IUsb<String, Double> {
}

// 当我们去实现 IA 接口时，因为 IA 在继承 IUsu 接口时，指定了 U 为 String R 为 Double
// ，在实现 IUsu 接口的方法时，使用 String 替换 U, 是 Double 替换 R
class AA implements IA{

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}


//实现接口时，直接指定泛型接口的类型
// 给 U 指定 Integer 给 R 指定了 Float
// 所以，当我们实现 IUsb 方法时，会使用 Integer 替换 U, 使用 Float 替换 R
class BB implements IUsb<Integer,Float>{

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}

//没有指定类型，默认为 Object
// 建议直接写成 IUsb<Object,Object>
class CC implements IUsb<Object,Object>{//等价 class CC implements IUsb<Object,Object>
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}
interface IUsb<U,R>{
    int n=10;
//    U name;//不能这样使用 static 上下文引用 'Chapter15.Generic.IUsb.this'
    R get(U u); //普通方法中，可以使用接口泛型

    void hi(R r);

    void run(R r1,R r2,U u1,U u2);
    //在 jdk8 中，可以在接口中，使用默认方法, 也是可以使用泛型
    default R method(U u){
        return null;
    }

}
