package override_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 21:33
 */


public class Override01 {
    public static void main(String[] args) {
        //演示方法重写的情况

        Dog dog = new Dog();

        //这里的cry调用的时其父类Dog的cry
        dog.cry();//ctrl+b
    }
}
