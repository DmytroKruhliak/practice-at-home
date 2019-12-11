package book.chapter2.page93_exercises;

public class DataOnly {
    static int a;
    char ch;
    boolean what;

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.a = 7;
        dataOnly.ch = 'g';
        dataOnly.what = true;
        System.out.println(dataOnly.a);
        System.out.println(dataOnly.ch);
        System.out.println(dataOnly.what);
    }
}
