package Chapter14.Collection_.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-16 19:42
 */


public class HashSetExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /**定义一个 Employee 类，该类包含：private 成员属性 name,age
         * 要求: 创建 3 个 Employee 对象放入 HashSet 中
         * 当 name 和 age 的值相同时，认为是相同员工, 不能添加到 HashSet 集合中 */
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack",18));
        hashSet.add(new Employee("jack",18));//这个不会添加成功
        hashSet.add(new Employee("lucy",18));
        hashSet.add(new Employee("tom",20));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next =" + next);
            /* output:
                next =Employee{name='tom', age=20}
                next =Employee{name='jack', age=18}
                next =Employee{name='lucy', age=18}
             */
        }
     }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 如果name 和 age 值相同，则返回相同的hash值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
