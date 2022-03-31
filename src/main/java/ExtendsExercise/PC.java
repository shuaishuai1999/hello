package ExtendsExercise;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 16:51
 */


public class PC extends Computer{
    private String brand; //品牌信息
    //这里IDEA根据继承的规则，自动把构造器的调用写好
    //这里也体现：继承设计的基本思想，父类的构造器完成父类属性初始化
    //子类的构造器完成子类属性初始化


    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("PC信息=");

//        System.out.println(getCpu()+getMemory()+getDisk());
        //调用父类的getDetails方法，得到相关属性信息
        System.out.println(getDetails()+" brand= "+brand);

    }
}
