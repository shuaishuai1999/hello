package poly1_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 11:01
 */


public class PolyArray {
    public static void main(String[] args) {
        //应用实例：现有一个继承结构如下：要求创建一个Person对象，
        // 2个student对象和2个Teacher对象，统一放在数组中，并调用每个对象的say方法
        Person[] person=new Person[5];
        person[0]=new Person("jack",20);
        person[1]=new Student("student1",18,80);
        person[2]=new Student("student2",17,90);
        person[3]=new Teacher("teacher1",28,5000);
        person[4]=new Teacher("teacher2",29,6000);
        //循环遍历多态数组，调用say
        for (int i = 0; i < person.length ; i++) {
            System.out.println(person[i].say());
            if(person[i] instanceof Student){
                //向下转型，
                Student student1=(Student)person[i];
                student1.study();
            }else if(person[i] instanceof Teacher){
                //向下转型
                Teacher teacher1=(Teacher)person[i];
                teacher1.teach();
            }else if(person[i] instanceof Person){
                System.out.println("你的类型ad错误，请自己检查");
            }else {
                System.out.println("你的类型错误，请自己检查");
            }
        }



    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //say方法
    public String say() {
        return name + "\t" + age;
    }

}

class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return " 学生 " + super.say() + " score " + score;
    }

    public void study() {
        System.out.println(" 学生 " + getName() + "正在学java...");
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say() {
        return " 老师 " + super.say() + " salary " + salary;
    }

    public void teach() {
        System.out.println("老师" + getName() + "正在将java课程...");
    }
}
