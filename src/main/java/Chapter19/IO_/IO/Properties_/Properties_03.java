package Chapter19.IO_.IO.Properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author shuaishuai
 * @create 2022-04-25 22:18
 * @Version 1.0
 * @Description
 * 2.使用Properties类添加 key-value 到新文件 mysql2.Properties
 * 3.使用Properties类完成对mysql2.Properties 的读取，并修改某个key-val
 */

public class Properties_03 {
    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();
//        String PropertiesFile="src/main/java/Chapter19/IO_/IO/Properties_/mysql.Properties";
        String PropertiesFile1="src/main/java/Chapter19/IO_/IO/Properties_/mysql_new.Properties";

        //使用 Properties 类来创建 配置文件, 修改配置文件内容
        Properties properties = new Properties();
        //创建
        // 1.如果该文件没有 key 就是创建
        // 2.如果该文件有 key ,就是修改
        /* Properties 父类是 Hashtable ， 底层就是 Hashtable 核心方法 '
        public synchronized V put(K key, V value) {
        // Make sure the value is not null if (value == null) {
        throw new NullPointerException(); }
        // Makes sure the key is not already in the hashtable.
        Entry<?,?> tab[] = table;
        int hash = key.hashCode(); int index = (hash & 0x7FFFFFFF) % tab.length;
        @SuppressWarnings("unchecked")
        Entry<K,V> entry = (Entry<K,V>)tab[index];
         for(; entry != null ; entry = entry.next) {
          if ((entry.hash == hash) && entry.key.equals(key)) {
           V old = entry.value; entry.value = value;//如果 key 存在，就替换 return old;
           }
           }
           addEntry(hash, key, value, index);
           //如果是新 k, 就 addEntry return null; }
            */
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");//注意保存时，是中文的 unicode 码值
        properties.setProperty("pwd","888888");
        //将 k-v 存储文件中即可
        properties.store(new FileOutputStream(PropertiesFile1),"新配置文件");
    }
}
