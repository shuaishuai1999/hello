package Chapter22.Reflection;

/**
 * @author shuaishuai
 * @create 2022-05-16 17:23
 * @Version 1.0
 * @Description
 */
class User {
    private int age = 10;
    private String name = "韩顺平教育";

    public User() {//无参 public
    }

    public User(String name) {
        this.name = name;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
