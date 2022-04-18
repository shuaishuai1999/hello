package Chapter15.Generic;

import java.util.ArrayList;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 16:26
 */


public class CustomMethodGeneric {
    @SuppressWarnings({"All"})
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",100.0);//class java.lang.String class java.lang.Double  //当调用方法时，传入参数，编译器，就会确定类型

        System.out.println("======");
        car.fly(123,100.1);//class java.lang.Integer  class java.lang.Double //当调用方法时，传入参数，编译器，就会确定类型


        //测试
        //T->String, R-> ArrayList
        System.out.println("======");
        fish<ArrayList, String> arrayListStringfish = new fish<>();
        arrayListStringfish.hello("string",new ArrayList());//class java.lang.String  class java.util.ArrayList

//        fish<Object, Object> fish = new fish<>();

    }
}

//泛型方法，可以定义在普通类中, 也可以定义在泛型类中
class Car {
    public void run() {//普通方法

    }

    //说明 泛型方法
    // 1. <T,R> 就是泛型
    // 2. 是提供给 fly 使用的
    public <T, R> void fly(T t, R r) {
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class fish<T, R> {
    public void run() {//普通方法
    }

    public <U, M> void eat(U u, M m) {//泛型方法
    }
    //说明
    // 1. 下面 hi 方法不是泛型方法
    // 2. 是 hi 方法使用了类声明的 泛型
    public void hi(T t){

     }


    //泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
    public<K> void hello(R r,K k){
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}
