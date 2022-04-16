package Chapter14.Collection_.List_.ArrayList_;

import java.util.ArrayList;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-15 15:22
 */


public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        ArrayList
        //Idea 默认情况下，Debug显示的数据是简化后的，如果希望看到完整的数据，需要做设置
        //使用无参构造器创建ArrayList对象  初始化容量
        ArrayList arrayList = new ArrayList(8);
//        ArrayList arrayList = new ArrayList();

        //使用for给list集合 添加1-10数据
        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }
        //使用for给list集合 添加11-15数据
        for (int i = 11; i <= 15; i++) {
            arrayList.add(i);
        }
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(null);

        // 快捷键  I 或者 iter
        for (Object o :arrayList) {
            System.out.println(o);
        }

    }
}
