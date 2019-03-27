package part_1;

public class Main {
    public static void main(String[] args) {
        Cat lion1 = new Lion("Simba", 5);
        Lion lion2 = new Lion("Mufasa", 23);
        HomeCat cat1 = new HomeCat("Vaska", 3);
        Cat cat = new Cat("Barsik", 15);
//        lion1.purPur();
//        lion1.voice();
//        lion2.voice();
//        lion2.purPur();
//        cat1.voice();
//        cat1.purPur();
        cat.voice();
        cat.purPur();

    }
}
