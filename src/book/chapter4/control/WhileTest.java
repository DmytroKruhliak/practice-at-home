package book.chapter4.control;

public class WhileTest {

    static boolean condition() {
        double prom = Math.random();
        System.out.println(prom);
        boolean result = prom < 0.99;
        System.out.println(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");
    }
}
