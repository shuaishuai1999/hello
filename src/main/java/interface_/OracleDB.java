package interface_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 10:24
 */


public class OracleDB implements DBInterface {


    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");

    }
}
