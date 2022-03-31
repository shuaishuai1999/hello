public class hello {
    public static void main(String[] args) {
        System.out.println("hello workd!");
        Test test = new Test();
        Test test1 = new Test();
        test.a();

    }
}

class Test {
    public int a() {
        return 1;
    }
}
