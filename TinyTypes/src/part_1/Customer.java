package part_1;

import part_1.TinyPackage.Age;
import part_1.TinyPackage.Gender;
import part_1.TinyPackage.Name;
import part_1.TinyPackage.Surname;

public class Customer {
    private final Name name;
    private final Age age;
    private final Gender gender;
    private final Surname;

    public Customer(Name name, Age age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
