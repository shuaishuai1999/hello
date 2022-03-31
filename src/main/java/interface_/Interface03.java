package interface_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-31 10:26
 */


public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
    }
    public static void t(DBInterface db){
        db.connect();
        db.close();
    }
}
