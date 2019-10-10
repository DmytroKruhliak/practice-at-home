package lang.hierarchyOfClasses;

public class TestInheritance {
    public static void main(String[] args) {

        Race race = new Race();
        Race race1 = new Human();
        Race race2 = new HumanFighter();
        Human human = new Human();
        HumanFighter hf = new HumanFighter();

        Warrior war = new Warrior();

//        war.chooseRace();
//
//        race.chooseRace();
//        race1.chooseRace();
//
//        human.chooseRace();
//
//        race2.chooseRace();
//        hf.chooseRace();

        war.doSomething(new HumanFighter());
        war.doSomething(new Human());
    }
}
