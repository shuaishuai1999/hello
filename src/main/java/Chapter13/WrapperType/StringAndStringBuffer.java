package Chapter13.WrapperType;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-11 16:37
 */


public class StringAndStringBuffer {
    public static void main(String[] args) {
    //String - > StringBuffer
        String str1="hello tom";
        //方式1：使用构造器
        //注意：返回才是StringBuffer对象，对手str本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str1);
        //方式2：使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str1);


    //StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("韩顺平教育");
        //方式1：使用StringBuffer提供的toString方法
        String s = stringBuffer1.toString();
        //方式2：使用构造器
        String s1 = new String(stringBuffer2);


    }
}
