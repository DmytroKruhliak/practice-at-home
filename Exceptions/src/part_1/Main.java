package part_1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        int[] m = {-1, 0, 1};
        int a = 1;
        Scanner sc = new Scanner(System.in);

        try {
            a = sc.nextInt();
            m[a - 1] = 4 / a;
            System.out.println(m[a]);

        } catch (ArithmeticException e) {
            System.out.println("Недопустимая арифметическая операция");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение к недопустимому индексу массива");
        } catch (Exception e) {
            System.out.println("Ещё какое-то исключение");
        }

    }


}