package book.chapter3.operators.page126Task14;

public class StringTest {
    public static void main(String[] args) {

        String s1 = new String("Journey");
        String s2 = "Journey";

        logicOperationsWithStr(s1, s2);
    }

    private static void logicOperationsWithStr(String s1, String s2) {
        System.out.println(s1 == s2); //false
        System.out.println(s1 != s2); //true
        System.out.println(s1 + s2); //JourneyJourney
        System.out.println(s1.equals(s2)); //true
        System.out.println(s2.intern() == s1);
    }
}
