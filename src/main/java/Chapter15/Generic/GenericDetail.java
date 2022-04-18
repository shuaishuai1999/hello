package Chapter15.Generic;


import java.util.ArrayList;
import java.util.List;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 11:14
 */


public class GenericDetail {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1.给泛型指向数据类型是，要求是引用类型，不能是基本数据类型
        ArrayList<Integer> integers = new ArrayList<>();
//        ArrayList<int> ints = new ArrayList<int>();//类型实参不能为基元类型

        //2.说明
        //因为E 制定了 A 类型，构造器传入了 new A()
        //在给泛型指定具体类型后，可以传入该类型或者其子类类型
        Pig<A> aPig = new Pig<>(new A());
        aPig.f();//class Chapter15.Generic.A
        Pig<A> bPig = new Pig<>(new B());
        bPig.f();//class Chapter15.Generic.B

        //3.泛型的使用方式
        ArrayList<Integer> integers1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        //在实际开发中，我们往往简写
        //编译器会进行类型判断，老师推荐使用下面写法
        ArrayList<Object> objects = new ArrayList<>();
        List<Integer> objects1 = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();

        //4.如果是这样写，泛型默认是Object
        ArrayList arrayList = new ArrayList();//等价 ArrayList<Object> arraylist=new ArrayList<Object>();
        /**
        public boolean add (Object e){
            ensureCapacityInternal(size + 1); // Increments modCount!!
            elementData[size++] = e;
            return true;
        }
         */
        Tiger tiger = new Tiger();
        /* class Tiger {//
            类 Object e;
            public Tiger() {}
            public Tiger(Object e) {
               this.e = e;
               }
               }
         */


    }
}

class Tiger<E> {
    E e;

    public Tiger() {

    }

    public Tiger(E e) {
        this.e = e;
    }

}

class A {
}

class B extends A {
}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());
    }
}
