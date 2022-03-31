package poly1_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 11:36
 */

//应用实例：定义员工类Employee,包含姓名和月工资（private），以及计算年工资getAnnual的方法。
// 普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manager方法，管理员工类多了work方法，
// 普通员工和经理类要求分别重写getAnnual方法

//测试类中添加一个方法showEmpAnnual(Employee e)，实现获取任何员工对象的年工资，并在main方法
// 中调用该方法e.getAnnual()
//测试类中添加一个方法testWork,如果时普通员工，则调用work方法，如果是经理，则调用manager方法

public class PolyParameter {
    public static void main(String[] args) {
        Worker milan = new Worker("milan", 2500);
        manager tom = new manager("tom", 5000, 20000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(milan);
        polyParameter.showEmpAnnual(tom);

        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
    }

    //查看员工年薪
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();//有向下转型操作
        } else if (e instanceof manager) {
            ((manager) e).manager();//有向下转型操作
        } else {
            System.out.println("不做处理");
        }
    }
}




class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getAnnual() {
        return salary * 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Worker extends Employee {
    public Worker(String name, int salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(getName() + "员工年薪" + getAnnual());
    }
    @Override
    public int getAnnual() {
        return getSalary() * 12;
    }

//    @Override
//    public int getSalary() {
//        return super.getSalary();
//    }
}

class manager extends Employee {
    private int bonus;//奖金

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }


    public void manager() {
        System.out.println(getName() + "管理员年薪" + getAnnual());
    }



        //重写
    @Override
    public int getAnnual() {
        return getSalary() * 13 + bonus;
    }
}

