package Chapter15.Generic.HomeWork;

import java.util.*;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-18 17:39
 */


public class HomeWork01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        User jack = new User(1, 12,"jack");
        HashMap hashMap = new HashMap();
        Dao<Object> objectDao = new Dao<>(hashMap);

        System.out.println("=============save==============");
        objectDao.save("1","hello one");
        objectDao.save("2","hello two");
        objectDao.save("3","hello three");
        objectDao.save("4","hello four");
        System.out.println("save = " +objectDao);

        System.out.println("=============get==============");
        System.out.println(objectDao.get("3"));



        System.out.println("=============update==============");
        objectDao.update("3","hello update three");
        System.out.println("objectDao = " +objectDao);

        System.out.println("=============list==============");
        System.out.println(objectDao.list());


        System.out.println("=============delete==============");
        objectDao.delete("3");
        System.out.println("objectDao = " +objectDao);

    }
}

class Dao<T> {
    T t;
    public Map<String, T> map;

    public Dao(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
     }
     public List<T> list(){
         ArrayList<T> ts = new ArrayList<>();
         Set<String> strings = map.keySet();
         for (String string : strings) {
             ts.add(map.get(string));
         }
         return ts;
     }
     public void delete(String id){
        map.remove(id);
      }

    @Override
    public String toString() {
        return "Dao{" +
                "t=" + t +
                ", map=" + map +
                '}';
    }
}


class User {
    private int id, age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
