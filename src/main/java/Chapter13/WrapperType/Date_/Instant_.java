package Chapter13.WrapperType.Date_;

import java.time.Instant;
import java.util.Date;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-13 15:03
 */


public class Instant_ {
    public static void main(String[] args) {
        //1.通过 静态方法 now() 获取表示当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);

        //2.通过 from 可以把 Instant 转成 Date
        Date from = Date.from(now);
        System.out.println(from);

        //3. 通过 date 的 toInstant() 可以把 date 转成 Instant 对象
        Instant instant = from.toInstant();
        System.out.println(instant);
    }
}
