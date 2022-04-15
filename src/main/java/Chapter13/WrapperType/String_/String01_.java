package Chapter13.WrapperType.String_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-11 15:18
 */


public class String01_ {
    public static void main(String[] args) {
        //1.String 对象用于保存字符串，也就是一组字符序列
        // 2. "jack" 字符串常量, 双引号括起的字符序列
        // 3. 字符串的字符使用 Unicode 字符编码，一个字符(不区分字母还是汉字)占两个字节
        // 4. String 类有很多构造器，构造器的重载
        // 常用的有 String s1 = new String();
        // //String s2 = new String(String original);
        // String s3 = new String(char[] a);
        // String s4 = new String(char[] a,int startIndex,int count)
        // String s5 = new String(byte[] b)
        // 5. String 类实现了接口 Serializable 【String 可以串行化，可以在网络上传输】
                            //接口 Compareble【String对象可以比较大小】
        // 6.String是final类，不能被其他的类继承
        // 7.String 有属性 private final char value[]; 用于存放字符串内容
        // 8.一定要注意：value 是一个final类型，不可以修改【需要功力】，即value不能指向新的地址，但是单个字符内容是可以变化的

        String name = "jack";
        name = "tom";
        final char[] value = {'a','b','c'};
        char[] v2 = {'t','o','m'};
        value[0] = 'H'; //value = v2; 不可以修改 value 地址

    }
}
