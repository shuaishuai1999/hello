package houserent.domain;

import houserent.domain.view.HouseView;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-28 22:07
 */


public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示菜单，是整个程序的入口
        new HouseView().mainMenu();
        System.out.println("===你已退出房屋出租系统===");
    }
}

