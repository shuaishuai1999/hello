package Chapter15.Generic;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 17:06
 */


public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        //T->String, R->Integer, M->Double
        Apple<String, Integer, Double> stringIntegerDoubleApple = new Apple<>();
        stringIntegerDoubleApple.fly(100.1);//10 会被自动装箱 Integer10, 输出 Integer
//        stringIntegerDoubleApple.fly(new Dog());
    }
}
class Apple<T,R,M>{//自定义泛型类

    public <E> void fly(E e){
        System.out.println(e.getClass().getSimpleName());
    }
    //public void eat(U u) {}//错误，因为 U 没有声明
    public void run(M m){
        System.out.println(m);
     }

}
class Dog1{}
