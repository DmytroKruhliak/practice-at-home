package lang.hierarchyOfClasses;

public class A {
    int a = 5;

    public A() {
        System.out.println("parent constr");
    }

    public static String staticMethod() {
        return "it's static method A";
    }

    public void privateMethod() {
        System.out.println("public A method");
    }
}
