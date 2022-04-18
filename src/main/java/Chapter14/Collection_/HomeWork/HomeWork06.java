package Chapter14.Collection_.HomeWork;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 23:09
 */


public class HomeWork06 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person("AA", 1001);
        Person p2 = new Person("BB", 1002);
        hashSet.add(p1);
        hashSet.add(p2);
        p1.name="CC";
        hashSet.remove(p1);
        System.out.println(hashSet);//[Person{name='BB', id=1002}, Person{name='CC', id=1001}]

        hashSet.add(new Person("CC",1001));
        System.out.println(hashSet);//[Person{name='BB', id=1002}, Person{name='CC', id=1001}, Person{name='CC', id=1001}]

        /**核心代码分析
         * 即出现上述结果原因
         * 1.hash值一旦计算完成后，不会发生改变
         * 2.插入新的 Node的条件次序
         * （1）先通过 hash 值确定，加入行
         * （2）如果所在行存在元素，则 先比较 hash值，如果 hash 值一样，再使用 equlas方法比较 key
         * （3）如果 key 相同，则不添加该 newNode，如果不相同，则添加该 newNode
         * if(p.hash == hash &&
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         */

        hashSet.add(new Person("AA",1001));
        System.out.println(hashSet);//[Person{name='BB', id=1002}, Person{name='CC', id=1001}, Person{name='CC', id=1001}, Person{name='AA', id=1001}]

    }
}
class Person{
    public String name;
    public int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // TODO: 2022/4/17

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
