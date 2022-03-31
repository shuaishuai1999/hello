package final_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-29 22:37
 */


public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.calArea());

    }
}
//计算圆形面积
class Circle{
    private double radius;
    private final double PI;//3.14

    public Circle(double radius) {
        this.radius = radius;
//        PI=3.14;
    }
    {
        PI=3.14;
    }
    public double calArea(){
        return PI*radius*radius;
    }

}
