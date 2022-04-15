package Chapter13.WrapperType;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-12 11:08
 */


public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        long stratTime=0L;
        long endTime=0L;
        StringBuffer stringBuffer = new StringBuffer("");


        //stringBuffer
        stratTime=System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//StringBuffer拼接20000次
            stringBuffer.append(String.valueOf(i));
        }
        endTime=System.currentTimeMillis();
        System.out.println("StringBuffer执行时间： "+(endTime-stratTime));




        //stringBuilder
        StringBuilder stringBuilder = new StringBuilder("");
        stratTime=System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//StringBuffer拼接20000次
            stringBuilder.append(String.valueOf(i));
        }
        endTime=System.currentTimeMillis();
        System.out.println("stringBuilder执行时间： "+(endTime-stratTime));



        //string
//        String s="";
        String s = new String("");
        stratTime=System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {//StringBuffer拼接20000次
            s = s + i;
        }
        endTime=System.currentTimeMillis();
        System.out.println("string执行时间： "+(endTime-stratTime));



    }
}


