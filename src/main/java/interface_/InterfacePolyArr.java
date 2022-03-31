package interface_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 14:48
 */


public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组-》创建接口数组
        usb1[] usb1s= new usb1[2];

        usb1s[0]=new phone1();
        usb1s[1]=new camera1();
        /*给 Usb 数组中，存放 Phone 和 相机对象，Phone 类还有一个特有的方法 call（），
        请遍历 Usb 数组，如果是 Phone 对象，除了调用 Usb 接口定义的方法外， 还需要调用 Phone 特有方法 call */

        //	2）接口多态数组
//		案例：给Usb数组中存放，phone和 相机对象，phone类还有一个特有方法call，请遍历usb数组，如果是phone对象，除了调用usb接口定义的方法外，还需要调用Phone 特有方法call

        for (int i = 0; i < usb1s.length; i++) {
                usb1s[i].work();
                if(usb1s[i] instanceof phone1){
                    ((phone1) usb1s[i]).call();
                }

        }
    }
}

interface usb1{
    void work();
}
class phone1 implements usb1 {
    @Override
    public void work() {
        System.out.println("phone");
    }
    public void call(){
        System.out.println("打电话");
    }
}
class camera1 implements usb1{
    @Override
    public void work() {
        System.out.println("camera");

    }
}
