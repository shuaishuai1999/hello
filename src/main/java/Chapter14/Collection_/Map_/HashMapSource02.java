package Chapter14.Collection_.Map_;

import java.util.HashMap;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 11:53
 */


public class HashMapSource02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //模拟HashMap触发扩容，树化情况，并Debug验证
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 12; i++) {
            hashMap.put(i, "hello");
        }
        hashMap.put("aaa", "bbb");
        System.out.println("hashMap=" + hashMap);//12 个 k-v
        // 布置一个任务，自己设计代码去验证，table 的扩容
        // 0 -> 16(12) -> 32(24) -> 64(64*0.75=48)-> 128 (96) ->
        // 自己设计程序，验证-》 增强自己阅读源码能力. 看别人代码
    }
}
