package Chapter22.Reflection;

/**
 * @author shuaishuai
 * @create 2022-05-09 21:03
 * @Version 1.0
 * @Description
 */

public class Cat {
    public String name="阿花";
    public String hahah ="filed1";
    public String hahahh ="filed2";

    public Cat() {//构造器
    }

    public Cat(String name, String hahah, String hahahh) {
        this.name = name;
        this.hahah = hahah;
        this.hahahh = hahahh;
    }

//    public Cat(String name) {
//        this.name = name;
//    }

    public void hi(){
//        System.out.println("汪汪");
    }
}
