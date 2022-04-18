package Chapter15.Generic;

import java.util.Arrays;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 15:26
 */


public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}

//老韩解读
// 1. Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
// 2, T, R, M 泛型的标识符, 一般是单个大写字母
// 3. 泛型标识符可以有多个.
// 4. 普通成员可以使用泛型 (属性、方法)
// 5. 使用泛型的数组，不能初始化
// 6. 静态方法中不能使用类的泛型
class Tiger1<A,B,C>{
}
class tiger<T,R,M>{
    String name;
    R r; //属性使用泛型
    M m;
    T t;
    //因为数组在new 不确定T的类型，就无法在内存中开辟空间
    T[] ts;

    public tiger(String name) {
        this.name = name;
    }

    public tiger(R r, M m, T t) {//构造器使用泛型
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public tiger(String name, R r, M m, T t, T[] ts) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
        this.ts = ts;
    }

    //因为静态是和类相关的，在类加载时，对象还没有创建
    // 所以，如果静态方法和静态属性使用了泛型，JVM 就无法完成初始化
//    static R r;//无法从 static 上下文引用 'Chapter15.Generic.tiger.this'
//    public static void m1(M m){}

    public String getName() {//方法使用到泛型
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}


