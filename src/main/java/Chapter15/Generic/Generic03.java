package Chapter15.Generic;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 10:27
 */


public class Generic03 {
    public static void main(String[] args) {

        //注意，特别强调：E 具体的数据类型在定义 Person 对象的时候指定， 即在编译期间，就确定类型E是什么类型
        Person<String> person = new Person<>("韩顺平");
        person.show();//String
    }
}

//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型，
// 或者是某个方法的返回值的类型，或者是参数类型
class Person<E>{
    E s;//E 表示 s的数据类型，该数据类型在定义Person 对象的时候指定，即在编译期间，就确定E是什么类型

    public Person(E s) {//E 也可以是参数类型
        this.s = s;
    }
    public E f(){ // 返回类型使用E
        return s;
    }
    public void show(){
        System.out.println(s.getClass());
     }
}
