package book.chapter2.page93_exercises;

public class AutoPackaging {
    public static void main(String[] args) {
        Character ch = 't';
        char ch1 = ch;
        System.out.println(ch.charValue());
        System.out.println(ch.equals(ch1));

    }
}
