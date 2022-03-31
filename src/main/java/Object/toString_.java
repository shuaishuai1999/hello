package Object;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-24 17:14
 */


public class toString_ {
    public static void main(String[] args) {
        //Object的toString源码
        //（1）getClass().getName() 类的全类名（包名+类名）
        //（2）Integer.toHexString(hashCode()) 将对象的hashcode值转成16进制字符串
        // public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
        Monster monster = new Monster("帅","网络工程师",7000);

        System.out.println(monster.toString()+" hashcode"+monster.hashCode());
        //重写之前  Object.Monster@4554617c hashcode1163157884
        //重写之后  Monster{name='帅', job='网络工程师', sal=7000.0} hashcode1163157884
        // 包名+类名（包名暂时没有）

        System.out.println(monster);
        //这里会自动调用monster.toString()    Monster{name='帅', job='网络工程师', sal=7000.0}
        try {
            monster.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写 toString 方法, 输出对象的属性
    // 使用快捷键即可 alt+insert -> toString
    @Override
    public String toString() {//重写后，一般是把对象的属性值输出，当然程序员也可以自己定制
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("程序运行完成...");
    }
}
