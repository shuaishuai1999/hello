package ExtendsExercise;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 16:47
 */

/*
* 案例 3 ExtendsExercise03.java
* 编写 Computer 类，包含 CPU、内存、硬盘等属性，getDetails 方法用于返回 Computer 的详细信息
* 编写 PC 子类，继承 Computer 类，添加特有属性【品牌 brand】
* 编写 NotePad 子类，继承 Computer 类，添加特有属性【color】
* 编写 Test 类，在 main 方法中创建 PC 和 NotePad 对象，
* 分别给对象中特有的属性赋值，以及从 Computer 类继承的 属性赋值，并使用方法并打印输出信息*/


public class Computer {
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails(){
//        System.out.println("cpu="+cpu+"memory="+memory+"disk="+disk);
        return " cpu= "+cpu+" memory= "+memory+" disk= "+disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
