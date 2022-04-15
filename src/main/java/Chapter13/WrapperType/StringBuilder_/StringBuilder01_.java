package Chapter13.WrapperType.StringBuilder_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-12 10:47
 */


public class StringBuilder01_ {
    public static void main(String[] args) {
        //老韩解读
        // 1. StringBuilder 继承 AbstractStringBuilder 类
        // 2. 实现了 Serializable ,说明 StringBuilder 对象是可以串行化(对象可以网络传输,可以保存到文件)
        // 3. StringBuilder 是 final 类, 不能被继承
        // 4. StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder 的 char[] value;
        // 因此，字符序列是堆中
        // 5. StringBuilder 的方法，没有做互斥的处理,即没有 synchronized 关键字,因此在单线程的情况下使用
        // StringBuilder
        StringBuilder hello = new StringBuilder("hello");

    }
}
