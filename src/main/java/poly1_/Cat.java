package poly1_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-23 21:06
 */


public class Cat extends Animal1{
    public void eat(){//方法重写
        System.out.println("猫吃鱼");
     }
     public void catchMouse(){//Cat特有方法
         System.out.println("猫抓老鼠");
      }
}
