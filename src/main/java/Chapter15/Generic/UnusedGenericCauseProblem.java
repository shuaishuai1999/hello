package Chapter15.Generic;

import java.util.ArrayList;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 10:02
 */


public class UnusedGenericCauseProblem {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //使用传统方法解决
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 5));

        //假如我们程序员，不小心，添加了一只猫
//        arrayList.add(new Cat("招财猫", 8));//ClassCastException

        //遍历
        for (Object o : arrayList) {
            //向下转型
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
        }


        //使用传统的方法来解决===> 使用泛型
        // 老韩解读
        // 1. 当我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是 Dog 类型 (细节后面说...)
        // 2. 如果编译器发现添加的类型，不满足要求，就会报错
        // 3. 在遍历的时候，可以直接取出 Dog 类型而不是 Object
        // 4. public class ArrayList<E> {} E 称为泛型,那么 Dog->E

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("旺财", 10));
        dogs.add(new Dog("发财", 1));
        dogs.add(new Dog("小黄", 5));

        //假如我们程序员，不小心，添加了一只猫
//        dogs.add(new Cat("招财猫", 8));//会爆出类型错误
        System.out.println("===使用泛型====");
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}

/*
  请编写程序，在 ArrayList 中，添加 3 个 Dog 对象
  Dog 对象含有 name 和 age, 并输出 name 和 age (要求使用 getXxx())
 */
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
