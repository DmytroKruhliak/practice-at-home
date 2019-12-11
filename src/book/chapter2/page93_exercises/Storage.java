package book.chapter2.page93_exercises;

public class Storage {
    String name;
    String secondName;


    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.name = "DimoN";

        System.out.println(storage.storage(storage.name));
    }

    private int storage(String s) {
        return s.length() * 2;
    }
}
