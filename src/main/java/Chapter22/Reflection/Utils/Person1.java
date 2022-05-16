package Chapter22.Reflection.Utils;

/**
 * @author shuaishuai
 * @create 2022-05-16 17:25
 * @Version 1.0
 * @Description
 */

class Person1 extends A implements IA, IB { //属性
    public String name;
    protected static int age; // 4 + 8 = 12
    String job;
    private double sal;

    //构造器
    public Person1() {
    }

    public Person1(String name) {
    }

    //私有的
    private Person1(String name, int age) {
    }

    //方法
    public void m1(String name, int age, double sal) {
    }

    protected String m2() {
        return null;
    }

    void m3() {
    }

    private void m4() {
    }
}
