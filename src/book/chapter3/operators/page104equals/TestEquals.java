package book.chapter3.operators.page104equals;

class Dog {
    String name;
    String says;
}

public class TestEquals {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Spot";
        dog1.says = "woof";

        dog2.name = "Scruffy";
        dog2.says = "baark";

        System.out.println(dog1.name + " says: " + dog1.says);
        System.out.println(dog2.name + " says: " + dog2.says);

        Dog dog3 = dog1;

        System.out.println(dog3.equals(dog1));
        System.out.println(dog3 == dog1);

    }
}
