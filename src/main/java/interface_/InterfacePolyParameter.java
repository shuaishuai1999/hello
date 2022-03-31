package interface_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 14:40
 */


public class InterfacePolyParameter {
    public static void main(String[] args) {
        // 接口的多态
        // 接口类型的遍历 usb 可以指向 实现 usb 接口类的对象实例
        usb usb=new camera();
        usb usb1=new phone();


        // 继承的多态
        AAA a=new BBB();
        AAA a1=new CCC();


    }
}


//接口的多态特性
//	1）多态参数
//		在前面USB接口案例中，UsbInterface usb, 既可以接受手机对象，有可以接受相机对象，就体现了接口的多态


interface usb {
    default void inject(){
        System.out.println("插入usb");
    }
}

class phone implements usb{

}
class camera  implements usb{

}
class AAA{
}
class BBB extends AAA{}
class CCC extends AAA{}
