package ExtendsExercise;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 17:00
 */


public class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, int memory, int disk) {
        super(cpu, memory, disk);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
