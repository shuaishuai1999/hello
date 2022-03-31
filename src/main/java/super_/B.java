package super_;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-03-22 17:22
 */


public class B extends A {
    public int n1 = 888;

    //编写测试方法
    public void test() {
        //super的访问不限于父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员
        //如果多个基类（上级类）中都有同名的成员，使用super访问遵循就近原则。A→B→C
        System.out.println("super.n1=" + super.n1);
        super.cal();
    }

    //访问父类的属性，但不能访问父类的private属性 【案例】super.属性名
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void cal() {
        System.out.println("B类的cal()方法");
    }

    public void sum(){
        System.out.println("B类的sum()");
        //希望调用父类-A的cal方法
        //这时，因为子类B没有cal方法，因此我可以使用下面三种方式

        //找cal方法时（cal()和this.cal()）,顺序是
        //（1）先找本类，如果有，则调用
        //（2）如果没有，则找父类（如果有，并可以调用，则调用）
        //（3）如果父类没有，则继续找父类的父类，直到object

        cal();
        //等价于 this.cal();
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
     }

     public void ok(){
        super.test100();
        super.test200();
        super.test3000();
//        super.test400(); 无权限
      }

    public B() {
        super("jack",10);
//        super("jack");
    }
}
