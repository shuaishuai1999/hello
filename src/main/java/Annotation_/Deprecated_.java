package Annotation_;

import super_.A;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-07 9:09
 */


public class Deprecated_ {
    public static void main(String[] args) {
        A1 a = new A1();
        a.hi();
    }
}
//1.@Deprecated 修饰某个元素，表示该元素已经过时
//2.即不在推荐使用，但是仍然可以使用
//3.查看@Deprecated 注释类源码
//4.可以修饰方法，类，字段，包，参数， 等等
//5.@Deprecated 可以做版本升级过渡使用
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
* */


@Deprecated
class A1{
    @Deprecated
    public int n1=100;
    @Deprecated
    public void hi(){
        System.out.println("hi");
    }
}
