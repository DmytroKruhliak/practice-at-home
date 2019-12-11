package book.chapter2.page93_exercises;

public class Incrementable {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        System.out.println(dataOnly.a);
        increment();
        System.out.println(DataOnly.a);

    }

    private static void increment(){
        DataOnly.a++;
    }
}
