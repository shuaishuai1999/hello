package Chapter14.Collection_.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-17 10:32
 */


public class MapExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /**
         * 使用HashMap 添加三个员工对象，要求
         * 键：员工id
         * 值：员工对象
         * 并遍历显示 工 资 > 18000 的员工 （遍历方式最少两种）
         * 员工类：姓名，工资，员工id
         */

        HashMap hashMap = new HashMap();
        hashMap.put("1", new employee("shuai", 18000, 1));
        hashMap.put("2", new employee("shuai", 18000, 2));
        hashMap.put("3", new employee("shuai", 18000, 3));
        hashMap.put("4", new employee("shuai", 18030, 3));
        hashMap.put("5", new employee("shuai", 18030, 5));

        //遍历
        //（1）迭代器
//        Set set = hashMap.entrySet();
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        System.out.println("====第一种遍历方式=====");
        while (iterator.hasNext()) {
            Object entry = iterator.next();
            employee ee=(employee) hashMap.get(entry);
//            System.out.println(ee.getClass());
            if (ee.getSalary() > 18000) {
                System.out.println(ee);
            }
                //            向下转型
//            Map.Entry entry1 = (Map.Entry) entry;
//            employee e = (employee) entry1.getValue();
//            if (e.getSalary() > 18000) {
//                System.out.println(e);
//            }
        }
        //（2）使用keySet -> 增强for
        Set set1 = hashMap.keySet();
        System.out.println("====第二种遍历方式=====");
        for (Object keySet : set1) {
            employee e1=(employee) hashMap.get(keySet);
            if(e1.getSalary()>18000){
                System.out.println(e1);
            }
        }
    }
}
    class employee {
        public String name;
        public double salary;
        public int No;

        public employee(String name, double salary, int no) {
            this.name = name;
            this.salary = salary;
            No = no;
        }
        // TODO: 2022/4/17

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public int getNo() {
            return No;
        }

        public void setNo(int no) {
            No = no;
        }

        @Override
        public String toString() {
            return "employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", No=" + No +
                    '}';
        }
    }

