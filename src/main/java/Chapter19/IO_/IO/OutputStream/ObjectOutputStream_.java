package Chapter19.IO_.IO.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author shuaishuai
 * @create 2022-04-24 20:16
 * @Version 1.0
 * @Description
 */

public class ObjectOutputStream_  {
    public static void main(String[] args) throws IOException {
        //序列化后，保存的文件格式，不是纯文本，而是按照他的格式来保存
        String filePath = "src/main/java/Chapter19/IO_/IO/OutputStream/ObjectOutputStreamSerializableFile.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));


        //序列化数据到：filePath
        oos.writeInt(100);// int -> Integer (实现了 Serializable)
        oos.writeBoolean(true);// boolean -> Boolean (实现了 Serializable)
        oos.writeChar('a');// char -> Character (实现了 Serializable)
        oos.writeDouble(9.5);// double -> Double (实现了 Serializable)
        oos.writeUTF("韩顺平教育");//String

        //保存一个dog对象
        oos.writeObject(new Dog("阿八",10,"日本","白色"));
        oos.close();


    }
}

// 需要实现 Serializable 才能进行序列化
class Dog implements Serializable {
    private String name;
    private int age;
    private String country;
    private String color;

    public Dog(String name, int age, String country, String color) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
