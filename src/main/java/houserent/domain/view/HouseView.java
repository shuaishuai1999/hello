package houserent.domain.view;

import houserent.domain.Utils.Utility;
import houserent.domain.domain.House;
import houserent.domain.service.HouseService;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-28 22:15
 */


public class HouseView {
    //1.显示界面
    //2.接受用户输入
    //3.调用HouseService完成对房屋信息的各种操作
    private boolean loop=true;
    private char key = ' ';
    private HouseService houseService=new HouseService(10);//设置数组的大小为2

    public void mainMenu() {
        do {
            System.out.println("================房屋出租系统================");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退   出");
            System.out.println("请输入你的选择（1-6）:");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("请输入你的选择（1-6）:");
                    break;
            }
        } while (loop);
    }
    //显示房屋列表
    public void listHouses() {
        System.out.println("==========房屋列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if(houses[i]!=null)
                System.out.println(houses[i]);
        }
        System.out.println("====================房屋列表显示完毕===================");
    }

    public void addHouse() {
        System.out.println("----------添加房屋----------");
        System.out.print("姓名：");
        String name=Utility.readString(4,"无名");
        System.out.print("电话：");
        String phone=Utility.readString(11);
        System.out.print("地址：");
        String address=Utility.readString(16);
        System.out.print("月租：");
        int rent=Utility.readInt();
        System.out.print("状态（未出租/已出租）：");
        String stat=Utility.readString(3);
        //创建一个新的House对象，注意id是系统分配的
        House newHouse = new House(0, name, phone, address, rent, stat);
        if(houseService.add(newHouse)){
            System.out.println("==========添加房屋成功==========");
        }else {
            System.out.println("==========添加房屋失败==========");
        }
    }

    public void delHouse() {
        System.out.println("----------删除房屋----------");
        System.out.print("请选择待删除房屋编号(-1退出),请小心选择：");
        int delid=Utility.readInt();
        if(delid==-1){
            System.out.println("----------放弃删除房屋信息----------");
            return;
        }
        char choice = Utility.readConfirmSelection();//该方法本身有循环判断的逻辑，必须输入Y/N
        if(choice=='Y'){//真的删除
            if(houseService.del(delid)){
                System.out.println("----------删除房屋信息成功----------");
            }else {
                System.out.println("----------删除房屋信息失败----------");

            }
        }else {
            System.out.println("----------放弃删除房屋信息----------");
        }

    }

    //根据id查找房屋信息的功能
    public void findHouse() {
        System.out.println("----------查找房屋----------");
        System.out.print("请输入你要查找的id：");
        int choice=Utility.readInt();
        //调用方法
        House house = houseService.find(choice);
        if(house!=null){
            System.out.println(house);
        }else {
            System.out.println("----------查找房屋信息id不存在----------");
        }
    }

    //根据id修改房屋信息
    public void updateHouse() {
        System.out.println("----------修改房屋信息----------");
        System.out.print("请选择待修改房屋编号（-1表示退出）：");
        int updateId=Utility.readInt();
        if(updateId==-1){
            System.out.println("----------你放弃修改房屋信息----------");
            return;
        }

        //根据输入的updateId，查找对象
        House house=houseService.find(updateId);
        if(house==null){
            System.out.println("----------修改房屋信息编号不存在...----------");
            return;
        }

        System.out.print("姓名：（"+house.getName()+"):");
        String name=Utility.readString(8,"");//这里如果用户直接回车，表示不修改该信息
        if(!"".equals(name)){
            house.setName(name);
        }
        System.out.print("电话：（"+house.getPhone()+"):");
        String phone=Utility.readString(11,"");
        if(!"".equals(phone)){
            house.setPhone(phone);
        }

        System.out.print("地址：（"+house.getAddress()+"):");
        String address=Utility.readString(11,"");
        if(!"".equals(address)){
            house.setPhone(address);
        }
        System.out.print("租金：（"+house.getRent()+"):");
        int rent=Utility.readInt(-1);
        if(rent!=-1){
            house.setRent(rent);
        }
        System.out.print("状态：（"+house.getState()+"):");
        String stat =Utility.readString(3,"");
        if(!"".equals(stat)){
            house.setState(stat);
        }
        System.out.println("============修改成功============");






    }

    public void exit(){
        char c=Utility.readConfirmSelection();
        if(c=='Y'){
            loop=false;
        }
     }


}
