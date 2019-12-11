package lang.hierarchyOfClasses;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();

//        System.out.println(A.staticMethod());
//        System.out.println(a.staticMethod());
//        a.privateMethod();

//        b.privateMethod();
//        System.out.println(b.staticMethod());
//        System.out.println(B.staticMethod());
        b.testMeth();

        System.out.println(ab.staticMethod());
        System.out.println(ab.staticMethod());
        ab.privateMethod();
    }
}
