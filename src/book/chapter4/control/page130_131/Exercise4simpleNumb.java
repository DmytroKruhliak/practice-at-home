package book.chapter4.control.page130_131;

public class Exercise4simpleNumb {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < 100; j++) {
                if ((i % 1 == 0) && (i % j == 0)) {
                    System.out.println(i);
                }
            }
        }
    }
}
