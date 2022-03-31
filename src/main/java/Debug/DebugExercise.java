package Debug;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 21:02
 */


public class DebugExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",18);
        System.out.println(person.toString());
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
