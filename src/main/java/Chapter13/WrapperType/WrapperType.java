package Chapter13.WrapperType;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-08 10:05
 */


public class WrapperType {
    public static void main(String[] args) {
        Object o=true ? new Integer(1):new Double(2.0);//三元运算符是一个整体， 数据类型发生转换，转换为  double精度最高的输出
        System.out.println(o);
    }
}
