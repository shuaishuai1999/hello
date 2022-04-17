package Chapter14.Collection_.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-16 19:56
 */


public class HashSetExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /**
         * 定义一个Employ类，该类包含：private 成员属性 name,sal,birthday(MyDate 类 型)，其中
         * birthday 为 MyDate 类型（属性包括：year，month，day） ，要求
         * 1.创建 3个 Employ 放入 HashSet中
         * 2.当 name 和 birthday 的值相同时，认为是普通员工，不能添加到 HashSet 集合中
         * */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employ("jack",1800,new myDate("2011","1","1")));
        hashSet.add(new Employ("jack",1800,new myDate("2011","1","1")));//无法添加  name 和 birthday 的值相同
        hashSet.add(new Employ("jack",100,new myDate("2011","1","1")));//无法添加  name 和 birthday 的值相同
        hashSet.add(new Employ("jack",1900,new myDate("2011","1","1")));//无法添加  name 和 birthday 的值相同
        hashSet.add(new Employ("jack",1900,new myDate("2011","1","1")));//无法添加  name 和 birthday 的值相同
        hashSet.add(new Employ("jack1",1800,new myDate("2011","1","1")));
        hashSet.add(new Employ("jack2",1800,new myDate("2011","1","1")));
        System.out.println("hashSet = "+ hashSet);

        //迭代器输出
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next ="+ next);
        }
    }
}
class Employ{
    private String name;
    private double sal;
    private myDate date;

    public Employ(String name, double sal, myDate date) {
        this.name = name;
        this.sal = sal;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employ employ = (Employ) o;
        return  Objects.equals(name, employ.name) && Objects.equals(date, employ.date);
//        return Double.compare(employ.sal, sal) == 0 && Objects.equals(name, employ.name) && Objects.equals(date, employ.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date);
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", date=" + date +
                '}';
    }
}
class myDate{
    private String year;
    private String month;
    private String day;

    public myDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    @Override
    public String toString() {
        return "myDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        myDate myDate = (myDate) o;
        return Objects.equals(year, myDate.year) && Objects.equals(month, myDate.month) && Objects.equals(day, myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
