package poly_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 21:58
 */


public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }


    //使用多态机制，可以统一的管理主人喂食的问题
    //animal编译类型是Animal,可以指向（接受）Animal子类的对象
    //food编译类型是Food，可以指向（接受）Food子类的对象
    public void feed(Animal1 animal1,Food food){
        System.out.println("主人"+name+"给"+animal1.getName()+"吃"+food.getName());

     }
}
