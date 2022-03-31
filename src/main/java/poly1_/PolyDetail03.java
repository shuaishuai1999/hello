package poly1_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 9:58
 */


public class PolyDetail03 {
    public static void main(String[] args) {

        BB bb = new BB();
        //instanceof 比较操作符：用于判断对象的 运行类型 是否为XX类型 或 是XX类型的子类型
        //bb的运行类型是BB类型
        System.out.println(bb instanceof BB);//true
        //bb的运行类型BB 是AA类型的子类型
        System.out.println(bb instanceof AA);//true

        //aa是编译类型，运行类型是BB();
        //BB是AA的子类
        AA aa=new BB();
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true


        Object obj = new Object();
        System.out.println(obj instanceof AA);//false

        String str="hello";
//        System.out.println(str instanceof AA);
        System.out.println(str instanceof Object);//true

    }
}

class AA{}
class BB extends AA{}
