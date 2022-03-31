package interface_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 14:56
 */


public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口变量可以指向，实现了该接口的类的对象的实例
        IG ig=new Teacher();

        IH ih=new Teacher();
    }
}

//	3）接口存在多态传递现象
//		//如果 IG 继承了 IH 接口，而 Teacher 类实现了 IG 接口
// 那么，实际上就相当于 Teacher 类也实现了 IH 接口. //这就是所谓的 接口多态传递现象.
interface IH{
    //此处定义方法，不能有方法体
    void hi();
}
interface IG extends IH{}
//类 "Teacher" 必须声明为抽象，或为实现 "IH" 中的抽象方法 "hi()"
class Teacher implements IG{

    @Override
    public void hi() {

    }
}
