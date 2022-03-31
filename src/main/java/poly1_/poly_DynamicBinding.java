package poly1_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 10:21
 */


public class poly_DynamicBinding {
    public static void main(String[] args) {
        //a的编译类型A。运行类型B
        A a = new B();
        System.out.println(a.sum());//30
        System.out.println(a.sum1());//20
    }
}

class A {
    public int i = 10;

    //动态绑定机制
    public int sum() {//父类sum()
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

class B extends A {//子类
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }
//
//    public int sum1() {
//        return i + 10;
//    }

    public int getI() {
        return i;
    }

}
