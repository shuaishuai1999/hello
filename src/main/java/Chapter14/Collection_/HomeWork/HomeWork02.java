package Chapter14.Collection_.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 21:42
 */


public class HomeWork02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        car car = new car("宝马", 400000);
        car car1 = new car("宾利", 5000000);
        car car2 = new car("abc", 5000000);
        arrayList.add(car);
        arrayList.add(car1);
        arrayList.add(car2);

        arrayList.remove(car);
        System.out.println(arrayList);

        System.out.println(arrayList.contains(car1));

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

        arrayList.clear();
        System.out.println(arrayList);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(car);
        arrayList1.add(car1);
        arrayList.addAll(arrayList1);
        System.out.println("添加arrayList1 后的arrayList=" + arrayList);

        System.out.println(arrayList.containsAll(arrayList1));

        arrayList.removeAll(arrayList1);
        System.out.println("删除arrayList1 后的arrayList=" + arrayList);


        arrayList.addAll(arrayList1);

        System.out.println("===增强for===");
        for (Object o : arrayList) {
            System.out.println(o);
        }

        System.out.println("===迭代器===");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

}
class car{
    public String carName;
    public double carPrice;

    public car(String carName, double carPrice) {
        this.carName = carName;
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "car{" +
                "carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
