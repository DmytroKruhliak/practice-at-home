package util.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner("На голой ветке\n" +
                "Ворон сидит одиноко.\n" +
                "Осенний вечер.\n\n***" +
                " \n" +
                " \n" +
                "В небе такая луна,\n" +
                "Словно дерево спилено под корень:\n" +
                "Белеет свежий срез.\n\n***" +
                " \n" +
                " \n" +
                "Как разлилась река!\n" +
                "Цапля бредет на коротких ножках,\n" +
                "По колено в воде.");

       //scanner.useDelimiter("\n");

//        if (scanner.hasNextInt()){
//            int number = scanner.nextInt();
//            System.out.println("Ist a fire!!!" + number);
//        } else {
//            System.out.println("no a fire...");
//        }
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

        }

        scanner.close();
    }
}
