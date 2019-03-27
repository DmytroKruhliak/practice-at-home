package enuM;

public class Main {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        //System.out.println(day);
        Book book1 = new Book("Thinking in Java", "Ekkel",Type.SCIENCE_FICTION);

//        Day[] days = Day.values();
//        for (Day s :
//                days) {
//            System.out.println(s);
//        }

        Type [] printStartAge = Type.values();
        for (Type s:
              printStartAge) {
            System.out.println(s.getStartAge());
        }
    }

}
