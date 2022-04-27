package Chapter21.InternetCoding;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author shuaishuai
 * @create 2022-04-26 14:26
 * @Version 1.0
 * @Description 编写代码，获取计算机的主机名和 IP 地址相关 API
 */

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机InetAddress 对象 getLocalHost
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-GEA7FGCD/172.30.0.1

        //2.根据指定主机名/域名获取ip地址对象 getByName
        InetAddress byName = InetAddress.getByName("LAPTOP-GEA7FGCD");
        System.out.println(byName);//LAPTOP-GEA7FGCD/172.30.0.1
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);//www.baidu.com/14.215.177.39

        //获取 InetAddress 对象的主机名 getHostName
        String hostName = byName1.getHostName();
        System.out.println(hostName);//www.baidu.com
        //获取 InetAddress对象的地址 getHostAddress
        String hostAddress = byName1.getHostAddress();
        System.out.println(hostAddress);//14.215.177.38

        //getCanonicalHostName 获取典型主机地址
        String canonicalHostName = byName1.getCanonicalHostName();
        System.out.println(canonicalHostName);//14.215.177.38

    }
}
