package enum_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-06 15:49
 */


public class EnumDetail {
    public static void main(String[] args) {
        xxx.CLASSICMUSIC.playing();
    }
}
interface A1{
    public void playing();

}
interface A2{}
enum xxx implements A1,A2{
    CLASSICMUSIC;

    @Override
    public void playing() {
        System.out.println("播放音乐。。。");
    }
}
