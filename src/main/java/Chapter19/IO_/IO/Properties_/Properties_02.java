package Chapter19.IO_.IO.Properties_;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author shuaishuai
 * @create 2022-04-25 22:08
 * @Version 1.0
 * @Description 使用 Properties类 读取 Properties文件
 *1.使用Properties类完成对mysql.Properties 的读取
 */

public class Properties_02 {
    public static void main(String[] args) throws IOException {
        String PropertiesFile="src/main/java/Chapter19/IO_/IO/Properties_/mysql.Properties";
        // 1. 创建Properties对象
        Properties properties = new Properties();
        // 2. 加载指定配置文件
        properties.load(new FileReader(PropertiesFile));
        // 3. 把k-v 显示控制台
        properties.list(System.out);
        // 3. 根据 key 获取对应的值.
        String ip=properties.getProperty("ip");
        String port=properties.getProperty("port");
        String user=properties.getProperty("user");
        String pwd=properties.getProperty("pwd");
        System.out.println(ip+" "+port+" "+user+" "+pwd);

    }
}
