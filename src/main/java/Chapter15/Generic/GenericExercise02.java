package Chapter15.Generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 11:41
 */


public class GenericExercise02 {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack", 13000, new MyDate("1999", "05", "13")));
        employees.add(new Employee("jack1", 13000, new MyDate("1999", "05", "13")));
        employees.add(new Employee("jack", 13000, new MyDate("1998", "05", "13")));
        employees.add(new Employee("jack", 13000, new MyDate("1998", "04", "13")));
        employees.add(new Employee("jack", 13000, new MyDate("1998", "04", "12")));
        employees.add(new Employee("lucy", 13000, new MyDate("2000", "11", "13")));
        employees.add(new Employee("lucy", 13000, new MyDate("2000", "11", "14")));
        employees.add(new Employee("smith", 13000, new MyDate("2011", "12", "13")));
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            // compare 返回值如果为正数，则sort按自然排序，即字符顺序来排序
            // 如果返回为负数，则sort 按自然排序的逆序排序
            public int compare(Employee o1, Employee o2) {

                //compareTo 方法，返回正数o1>o2 返回负数 o1<o2 返回0 相等
                if (o1.getName().compareTo(o2.getName()) != 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                else {
                    //年龄数目越小，年龄越大
                    if (o1.getBirthday().getYear().compareTo(o2.getBirthday().getYear()) != 0) {
                        return o1.getBirthday().getYear().compareTo(o2.getBirthday().getYear());
                    }
                    if (o1.getBirthday().getMonth().compareTo(o2.getBirthday().getMonth()) != 0) {
                        return o1.getBirthday().getMonth().compareTo(o2.getBirthday().getMonth());
                    }
                    if (o1.getBirthday().getDay().compareTo(o2.getBirthday().getDay()) != 0) {
                        return o1.getBirthday().getDay().compareTo(o2.getBirthday().getDay());
                    }
                }
                return 0;
            }
//                return 0;
        });

        //遍历输出
        System.out.println("=====遍历输出=====");
        for (Employee next : employees) {
            System.out.println(next);
        }

    }
}

/*** 定义 Employee 类 *
 * 1) 该类包含：private 成员变量 name,sal,birthday，其中 birthday 为 MyDate 类的对象； *
 * 2) 为每一个属性定义 getter, setter 方法； *
 * 3) 重写 toString 方法输出 name, sal, birthday *
 * 4) MyDate 类包含: private 成员变量 month,day,year；并为每一个属性定义 getter, setter 方法； *
 * 5) 创建该类的 3 个对象，并把这些对象放入 ArrayList 集合中（ArrayList 需使用泛型来定义），对集合中的元素进 行排序，并遍历输出：
 * ** 排序方式： 调用 ArrayList 的 sort 方法 ,
 * * 传入 Comparator 对象[使用泛型]，先按照 name 排序，如果 name 相同，则按生日日期的先后排序。【即：定制排序】
 * * 有一定难度 15min , 比较经典 泛型使用案例 GenericExercise02.java
 * */
class Employee {
    public String name;
    public double sal;
    public MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private String year;
    private String month;
    private String day;
    private int year1;
    private int month1;
    private int day1;

    //直接将方法封装到 类文件中，
    //可以获得封装的好处，代码也更简洁

    @Override
    public int compareTo(MyDate o) {
        int minus=year1-o.year1;
        int minus1=month1-o.month1;
        int minus2=day1-o.day1;
        if(minus!=0){
            return minus;
        }
        //如果year相同，就比较month
        if (minus1!=0){
            return minus1;
        }
        //如果 year 和 month 相同
        return minus2;
    }


    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    // TODO: 2022/4/18

    @Override
    public String toString() {
        return "MyDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }


}
