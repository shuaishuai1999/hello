package Annotation_;

import java.lang.annotation.Target;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-07 9:07
 */


public class Override_ {
}
class Father{
    public void hello(){
        System.out.println("hello");
     }
}
class son extends Father{
    @Override
    public void hello() {
        super.hello();
    }
}
