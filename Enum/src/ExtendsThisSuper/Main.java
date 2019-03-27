package ExtendsThisSuper;

public class Main {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        Crow crow = new Crow();

        ostrich.setName("Ostrich");
        Birds ostrich2 = new Ostrich();
        ((Ostrich) ostrich2).hideHead();
    }
}






