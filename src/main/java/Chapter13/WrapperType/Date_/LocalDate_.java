package Chapter13.WrapperType.Date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-13 11:31
 */


public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期类
        //老韩解读
        //1.使用now（）返回表示当前日期时间的 对象
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime now2 = LocalTime.now();
        System.out.println(now2);

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);

        //2.使用DateTimeFormatter 对象来进行格式化
        //创建 DateTimeFormatter对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter);
        String format = dateTimeFormatter.format(now1);
        System.out.println("格式化后的日期"+format);

        System.out.println("年="+now1.getYear());
        System.out.println("月="+now1.getMonth());
        System.out.println("月="+now1.getMonthValue());
        System.out.println("日="+now1.getDayOfMonth());
        System.out.println("时="+now1.getHour());
        System.out.println("分="+now1.getMinute());
        System.out.println("秒="+now1.getSecond());

        LocalDate now3 = LocalDate.now();//可以获取年月日
        LocalTime now4 = LocalTime.now();//可以获取时分秒

        //提供plus和minus 方法可以对当前时间进行加或者减
        //看看890天后，是什么时候  把 年月日-时分秒
        LocalDateTime localDateTime = now1.plusDays(890);
        System.out.println("890天后="+localDateTime);

        //看看 3456 分钟前
        LocalDateTime localDateTime1 = now1.minusMinutes(3456);
        System.out.println("3456分钟前  日期 = " + localDateTime1);


    }
}
