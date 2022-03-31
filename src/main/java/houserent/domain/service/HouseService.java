package houserent.domain.service;

import houserent.domain.domain.House;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-28 22:15
 */


public class HouseService {

    //定义House[],保存House对象
    private House[] houses;
    private int housesNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值

    public HouseService(int size) {
        //new houses
        houses = new House[size];//当创建HouseService对象，指定数组大小
        //初始化一个House对象
        houses[0] = new House(1, "jack", "123", "海淀区", 2000, "未出租");

    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否害可以继续添加
        if (housesNums == houses.length) {//不能再添加
            System.out.println("数组已满，不能再添加了。。。");
            return false;
        }
        //新增一个房屋
        houses[housesNums++] = newHouse;
        //我们程序员要设置一个id自增长机制,然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delid) {
        //判断删除的编号是否存在
        //注意数组下标+1 才等于 房屋编号

        int index = -1;
        for (int i = 0; i < housesNums; i++) {
            if (delid == houses[i].getId()) {//要删除房屋的id，是数组下标为i的元素
                index = i;//就是用index'记录i
            }
        }
        if (index == -1) {//说明delid再数组中不存在
            return false;
        }
        //如果找到，则将删除的此项房屋信息，用后面的房屋信息进行覆盖
        for (int i = 0; i < housesNums - 1; i++) {
            houses[i] = houses[i + 1];//将后一项，覆盖到前一项
        }
        houses[--housesNums] = null;//把当前存在的房屋信息的最后一个置为空
//        idCounter--;
        return true;
    }


    //list方法，返回houses
    public House[] list() {
        return houses;
    }


    public House find(int findId) {

        //遍历数组
        for (int i = 0; i < housesNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

}
