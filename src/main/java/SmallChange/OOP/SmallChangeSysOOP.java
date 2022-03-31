package SmallChange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-25 9:54
 */


/*
    该类是完成零钱通的各个功能的类
    使用OOP(面向对象编程)
    思路：将各个功能对应一个方法

* */


public class SmallChangeSysOOP {

    public String key = " ";
    Scanner scanner = new Scanner(System.in);
    public String details = "--------------- 零钱通明细 -----------------"+
            "\n"+"开支介绍"+"\t"+"收入支出"+"\t"+"开支时间"+"\t\t\t\t"+"余额";
    //余额
    public double balance = 0;
    //money
    public double money = 0;
    Date date=new Date();
    public boolean loop=true;
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
    public String note=" ";
    public String columns=" ";

    //先完成显示菜单，并可以选择
    public void mainMenu() {
        System.out.println("显示零钱通菜单...");
        do {
            System.out.println("===============零钱通（OOP）===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请输入要执行的操作：");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    System.out.println("您已成功退出零钱通...");
                    break;
                default:
                    System.out.println("输入有误，请输入1-4之间的数字");
            }


        } while (loop);

    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.println("请输入收益金额：");
        money=scanner.nextDouble();
        //待会要对money的值进行判断
        if (money<=0){
            System.out.println("收益金额需大于0");
            return;
        }

        balance+=money;
        details+="\n"+"收益入账"+"\t+"+money+"\t"+sdf.format(date)+"\t"+balance;


    }

    //完成消费
    public void pay() {
        System.out.println("请输入消费项目");
        note=scanner.next();

        System.out.println("请输入消费金额：");
        money=scanner.nextDouble();
        if(money>=balance){
            System.out.println("余额不足...");
            return;
        }
        balance-=money;
        details+="\n"+note+"\t\t-"+money+"\t"+sdf.format(date)+"\t"+balance;
    }

    //退出
    public void exit() {
        String choice = "";
       //while+ break 组合
        while (true){
           System.out.println("你确定要退出吗？ y/n");
           choice=scanner.next();
           if("y".equals(choice)||"n".equals(choice)){
               break;
           }
       }
        if(choice.equals("y")){
            loop=false;
        }

    }
}
