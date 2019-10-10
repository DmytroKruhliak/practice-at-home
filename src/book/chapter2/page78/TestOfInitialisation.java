package book.chapter2.page78;

public class TestOfInitialisation {
    static int x;
    public static void main(String[] args) {
        System.out.println(x); //if we call 'x' variable, we got x from class field
        test();
        System.out.println(x);
    }

    private static void test() {
        TestOfInitialisation.x = 9; // appeal to 'x' variable of class
        x = 0;
        int x;
        //System.out.println(x);
    }
}
