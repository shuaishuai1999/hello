package Debug;

import java.util.Arrays;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 20:22
 */


public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};

        //我们看看 Arrays.sort 方法底层实现.->Debug
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
    }
}
