package Chapter15.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 17:11
 */


public class GenericExtends {
    public static void main(String[] args) {
//        List<Object> list = new ArrayList<String>();//java: 不兼容的类型: java.util.ArrayList<java.lang.String>无法转换为java.util.List<java.lang.Object>

        //举例说明下面三个方法的使用
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();
        List<AAB> aabs = new ArrayList<>();

        //如果是 List<?> c ，可以接受任意的泛型类型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //如果是 ? extends AA ，可以接受AA和他的子类
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);
//        printCollection2(list1);//报错

        //如果是 ? super AA ，可以接受AA类以及A类的父类
        printCollection3(list3);
        printCollection3(aabs);
//        printCollection3(list4);//报错
    }

    class AAB{}

    class AA  extends AAB{
    }

    class BB extends AA {
    }

    class CC extends BB {
    }

    //说明: List<?> 表示 任意的泛型类型都可以接受
    public static void printCollection1(List<?> c) {
        for (Object object : c) { // 通配符，取出时，就是 Object
            System.out.println(object);
        }
    }

    // ? extends AA 表示 上限，可以接受 AA 或者 AA 子类
    public static void printCollection2(List<? extends AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    // ? super 子类类名 AA:支持 AA 类以及 AA 类的父类，不限于直接父类，
    // 规定了泛型的下限
    public static void printCollection3(List<? super AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
}



