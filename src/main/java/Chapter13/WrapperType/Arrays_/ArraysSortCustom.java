package Chapter13.WrapperType.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-12 16:55
 */


public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};
//        bubble01(arr);
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int o11 = (Integer) o1;
                int o22 = (Integer) o2;
                return o22-o11;//从大到小， 如果是o11-o22就是从小到大
            }
        });
        System.out.println("===定制后的排序情况===");
        System.out.println(Arrays.toString(arr));
    }


    //完成冒泡排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //从小到大
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //结合冒泡 + 定制
    public static void bubble02(int[] arr, Comparator c){
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                //数组排序由 c.compare(arr[j],arr[j+1])>0 返回的值决定
                if(c.compare(arr[j],arr[j+1])>0){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}

