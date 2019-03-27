package part_1;

public class HomeCat extends Cat{
    public HomeCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("MEOW!");
    }

    @Override
    public void purPur() {
        super.purPur();
    }
}
