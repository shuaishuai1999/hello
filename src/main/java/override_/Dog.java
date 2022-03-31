package override_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 21:23
 */


public class Dog extends Animal{

    //1.因为Dog是Animal子类
    //2.Dog的cry方法和Animal的cry定义形式一样（名称，返回类型，参数）
    //3.这时我们就说Dog的cry方法，重写了Animal的cry方法
    public void cry(){
        System.out.println("小狗汪汪叫...");
     }


     //细节：子类方法的返回类型和父类返回类型一样

    public String m1(){
        return null;
    }

//    这里Object 不是String的子类，因此编译错误
//    public Object m2(){
//        return null;
//    }

    //与父类m3方法冲突，且不满足override条件
//    public BBB m3(){
//        return null;
//    }

    //细节：子类方法不能缩小父类方法的访问权限
    //public →protected→默认→private



//    private void eat(){
//
//    }
    public void eat(){

     }
}

class AAA{

}

class BBB extends AAA{

}
