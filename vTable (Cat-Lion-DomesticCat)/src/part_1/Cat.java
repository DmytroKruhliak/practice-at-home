package part_1;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void voice() {
    }
    public void purPur (){
        System.out.println("all cats can make purpur");
    }

}
