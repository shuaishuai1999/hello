package Object;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 16:25
 */


public class EqualExercise01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 10, '男');
        Person person1 = new Person("jack", 20, '男');


        //1.==：既可以判断基本类型，又可以判断引用类型
        //2.==：如果判断基本类型，判断的是值是否相等。示例：int i=10;double d=10.0;
        //3.==: 如果判断引用类型，判断的是地址是否相等，即判断是不是同一个对象
        System.out.println(person.equals(person1));//F


        System.out.println(person1.getName()==person.getName());//T
        //String 的equals为判断字符串是否相等
        System.out.println(person.getName().equals(person1.getName()));//T
        System.out.println(person.getAge()== person1.getAge());//F
        System.out.println(person.getAge());//10

        System.out.println(person1.equals(person));//false




        int it=65;
        float fl= 65.0F;
        System.out.println("65和65.0f是否相等？"+(it==fl));//T
        char ch1='A';
        char ch2=12;
        System.out.println("65和A "+(it==ch1));//T
        System.out.println("12和ch2 "+(12==ch2));//T

        String s1=new String("abc");
        String abc = new String("abc");

        //这两个都是new 出来的对象，所以比较的是对象，所以为false
        System.out.println("123 "+(s1==abc));//F
        System.out.println(s1.equals(abc));//T
//        System.out.println("hello"==new java.sql.Date());

    }
}
class Person{//extend Object
    private String name;
    private int age;
    private char gender;//性别

    //重写equals方法
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if (obj instanceof Person){//是Person我们才比较
            Person p=(Person) obj;//向下转型
            return this.name.equals(p.name)&&this.age==p.age&&this.gender== p.gender;

        }
        //如果不是Person，则直接返回false
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
