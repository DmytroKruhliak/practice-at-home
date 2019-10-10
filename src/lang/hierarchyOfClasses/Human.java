package lang.hierarchyOfClasses;

public class Human extends Race {
    int INT = 0;
    public void getInt() {
        super.INT = 50;
    }

    @Override
    public void chooseRace() {
        System.out.println("I'm human!");
    }
}
