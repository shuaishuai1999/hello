package extend1;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 15:44
 */


public class ExtendTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局

        //-》这时请大家注意，要按照查找关系来返回信息
        //（1）首先看子类是否有该属性
        //（2）如果子类有这个属性，并且可以访问，则返回信息
        //（3）如果子类没有这个属性，就看父类有没有这个属性（如果父类有该属性，并且可以访问，就返回信息...）
        //（4）如果父类没有这个属性，就按照（3）的规则，继续找上级父类，知道Object...
        System.out.println(son.name);//返回大头儿子
//        System.out.println(son.age);//返回39
        System.out.println(son.getAge());//返回39
        System.out.println(son.hobby);//返回的就是旅游,返回的是爷爷的hobby,说明已经找到爷类



    }
}

class Grandpa{//爷类
    String name="大头爷爷";
    String hobby="旅游";
}

class Father extends Grandpa{//父类
    String name="大头爸爸";
    private int age=39;

    public int getAge(){
        return age;
    }

}
class Son extends Father{ //子类
    String name="大头儿子";

}
