package Chapter13.WrapperType.StringBuffer_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-11 17:35
 */


public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;// ok
        StringBuffer sb = new StringBuffer(); //ok
        sb.append(str);
        //需要看源码 , 底层调用的是 AbstractStringBuilder 的 appendNull System.out.println(sb.length());
        // 4 System.out.println(sb);//null 第 560页

        //下面的构造器，会抛出 NullpointerException
        StringBuffer sb1 = new StringBuffer(str);// 看底层源码 super(str.length() + 16);
        System.out.println(sb1);
    }
}
