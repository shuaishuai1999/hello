package encap;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 11:10
 */


public class Account {
    //为了封装，将3个属性设置为private
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器
    //1.默认构造器
    public Account() {
    }
    //2.自定义构造器

    public Account(String name, double balance, String pwd) {
        this.name = name;
        this.balance = balance;
        this.pwd = pwd;
    }

    //获取name属性的条件
    public String getName() {
        return name;
    }

    //参数的设置前的限制条件
    //姓名（长度为2-4位）
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字长度不在2-4个字符范围内，使用默认名字");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    //余额必须>20
    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须>20 默认为0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    //密码必须是六位
    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码长度必须为六位，默认密码为000000");
            this.pwd="000000";
        }

    }

    //显示账号信息
    public void showinfo(){
        //可以增加权限的校验
        System.out.println("name="+name+"balance="+balance+"pwd="+pwd);
        if(balance<100){
            System.out.println("name="+name+"balance="+balance+"pwd="+pwd);
        }else {
            System.out.println("你无权查看。。。");
        }
    }
}
