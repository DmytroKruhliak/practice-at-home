package part_1;

public class Lion extends Cat {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("ROAAR!");
    }

    @Override
    public void purPur() {
        System.out.println("hrrrr..pur");
    }
}
