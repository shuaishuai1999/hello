package interface_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 10:22
 */


public class MysqlDB implements DBInterface{


    //类 "MysqlDB" 必须声明为抽象，或为实现 "DBInterface" 中的抽象方法 "connect()"
    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");

    }
}
