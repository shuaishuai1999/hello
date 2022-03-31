package encap;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 11:23
 */


public class TestAccount {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("帅志军");
        account.setBalance(101);
        account.setPwd("123456");
        account.showinfo();


    }
}
