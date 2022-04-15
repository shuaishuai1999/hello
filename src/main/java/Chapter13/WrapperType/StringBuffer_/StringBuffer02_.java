package Chapter13.WrapperType.StringBuffer_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-11 17:07
 */


public class StringBuffer02_ {

    public static void main(String[] args) {
        //构造器的使用
        //老韩解读
        //1.创建一个 大小为16 的char[] ,用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        //2.通过构造器指定 char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3.通过给一个String 创建StringBuffer
        StringBuffer hello = new StringBuffer("hello");
    }


}
