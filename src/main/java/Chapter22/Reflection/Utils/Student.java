package Chapter22.Reflection.Utils;

/**
 * @author shuaishuai
 * @create 2022-05-16 17:32
 * @Version 1.0
 * @Description
 */
class Student {
    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
