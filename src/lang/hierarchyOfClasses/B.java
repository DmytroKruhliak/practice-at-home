package lang.hierarchyOfClasses;

public class B extends A {

    public B() {
        System.out.println("child B constr");
    }

    public static String staticMethod() {
        return "static B method";
    }

    public void privateMethod() {
        System.out.println("public B method");
    }

    public void testMeth() {
        System.out.println("fuck you!");
    }

}
