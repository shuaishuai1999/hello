package poly1_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-23 21:08
 */


public class PolyDetail1 {
    public static void main(String[] args) {
        //向上转型：父类的引用指向了子类的对象
        //语法：父类类型引用名=new 子类类型（）；
        Animal1 animal1=new Cat();
        Object obj=new Cat();//可以吗？可以，因为Object也是cat的父类

        //向上转型调用方法的规则如下：
        //（1）可以调用父类中的所有成员（需受访问权限限制）
        //（2）但是不能调用子类的特有成员
        //（3）因为在编译阶段，能调用哪些成员，是由编译类型决定的
        //（4）最终运行效果看子类（运行类型）的具体实现，即调用方法，按照从子类（运行类型）开始查找方法
        //然后调用，规则与之前将的规则一致
        //（5）编译阶段，按照编译类型处理程序，运行阶段，按照运行类型处理程序
        animal1.eat();//猫吃鱼
        animal1.run();//跑
        animal1.show();//hello，你好
        animal1.sleep();//睡


        //如果希望调用Cat的catchMouse方法
        //则
        //多态的向下转型
        //（1）语法：子类类型 引用名=（子类类型）父类引用；
        //当为如下情况时，此时cat的编译类型为Cat，运行类型也为Cat
        Cat cat=(Cat)animal1;
        cat.catchMouse();//猫抓老鼠
        //（2）要求父类的引用必须指向的是当前目标类型的对象
        //因为此时animal1的编译类型已经是cat了，不能再转为dog
//        Dog dog=(Dog)animal1;//可以吗？不可以

    }
}
