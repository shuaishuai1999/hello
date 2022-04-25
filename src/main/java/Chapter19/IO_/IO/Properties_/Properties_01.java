package Chapter19.IO_.IO.Properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author shuaishuai
 * @create 2022-04-25 21:37
 * @Version 1.0
 * @Description
 */

public class Properties_01 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties 文件，并得到 ip,user 和 pwd
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/Chapter19/IO_/IO/Properties_/mysql.Properties"));
        String line="";
        while ((line= br.readLine())!=null){
            String[] split=line.split("=");
            //如果我们要求指定的ip值
            if("ip".equals(split[0])){
                System.out.println("IP 为 ："+split[1]);
            }
        }
        br.close();
    }
}
