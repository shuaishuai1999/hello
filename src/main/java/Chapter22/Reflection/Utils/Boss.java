package Chapter22.Reflection.Utils;

/**
 * @author shuaishuai
 * @create 2022-05-16 17:41
 * @Version 1.0
 * @Description
 */
class Boss {
    private int age;
    private static String name;

    public Boss() {
    }

    public Monster m1() {
        return new Monster();
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println("hi" + s);
    }
}
