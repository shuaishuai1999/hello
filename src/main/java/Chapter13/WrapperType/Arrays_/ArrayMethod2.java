package Chapter13.WrapperType.Arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-13 9:25
 */


public class ArrayMethod2 {
    public static void main(String[] args) {
        Integer[] arr={1,2,90,123,567};
        //binarySearch 通过二分法搜索法进行查找，要求必须排好
        //老韩解读
        //1.使用binarySearch 二叉查找
        //2.要求该数组是有序的，如果该数组是无序的，不能使用binarySearch
        //3.如果数组中不存在该元素，就返回  return -(low+1); //key not found
        int index= Arrays.binarySearch(arr,1234);
        System.out.println("index= "+index);

        //copyOf 数组元素的复制
        //老韩解读
        //1.从arr数组中，拷贝 arr.length 个元素到 newArr 数组中
        //2.如果拷贝的长度 > arr.length  就在新数组后面加一个 null
        //3.如果拷贝长度  < 0  就抛出异常 NegativeArraySizeException （负数数组大小异常）
        //4.该方法的底层使用的是 System.arraycopy()
        Integer[] newArr=Arrays.copyOf(arr,arr.length);
        System.out.println("===拷贝执行完毕后===");
        System.out.println(Arrays.toString(newArr));

        //ill数组元素的填充
        Integer[] num=new Integer[]{9,3,2,99};
        //老韩解读
        //1.使用99 去填充数组，可以理解成是替换原理的元素
        Arrays.fill(num,99);
        System.out.println("num数组填充后");
        System.out.println(Arrays.toString(num));//[99, 99, 99,99]

        //equals 比较两个数组元素内容是否完全一致
        Integer[] arr2={1,2,90,123,567};
        System.out.println("equals 运行结果");
        System.out.println(Arrays.equals(arr,arr2));


        //asList将一组值，转换成list
        //老韩解读
        //1.asList方法，会将（2，3，4，5，6，1）数据转成一个List集合
        //2.返回的asList编译类型 List（接口）
        //3. asList 运行类型 java.util.Arrays#ArrayList, 是 Arrays 类的
        // 静态内部类 private static class ArrayList<E> extends AbstractList<E>
        //                            implements RandomAccess, java.io.Serializable

        List asList=Arrays.asList(2,3,4,5,6,1);
        System.out.println("asList= "+asList);
        System.out.println("asList 的运行类型 "+asList.getClass());
    }
}
