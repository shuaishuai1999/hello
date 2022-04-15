package Chapter13.WrapperType.BigIntegerAndBigDecimal;

import java.math.BigInteger;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-13 10:30
 */


public class BigInteger_ {
    public static void main(String[] args) {
        //当我们编程中，需要处理很大的整数，long不够用
        //可以使用BigInteger的类来搞定
        long l =235999999;
        System.out.println("l="+l);
        BigInteger bigInteger = new BigInteger("23333333333338999999999999");
        System.out.println("bigInteger ="+bigInteger);
        BigInteger bigInteger1 = new BigInteger("23333333333338999999999999");
        System.out.println("bigInteger1 =" +bigInteger1);
        //老韩解读
        // 1. 在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行 + - * /
        // 2. 可以创建一个 要操作的 BigInteger 然后进行相应操作

        BigInteger add=bigInteger.add(bigInteger1);
        System.out.println("add="+add);//加
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println("subtract="+subtract);//减
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println("multiply= "+multiply);//乘
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println("divide="+divide);//除
    }
}
