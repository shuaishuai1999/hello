package abstract_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-30 21:40
 */


public class AAA extends Template{

    //计算任务
    //1+。。。+80000
    @Override
    public void job() {
        long num=0;
        for (int i = 0; i < 80000000; i++) {
            num+=i;
        }
    }

    public void job2(){

    }
}
