package book.chapter4.control.page130_131;

import java.util.ArrayList;

public class Exercise4PrimeNumb {
    public static void main(String[] args) {

        getPrimeNumbList(100);
        System.out.println();

    }

    private static void getPrimeNumbList(int limit) {
        ArrayList<Integer> primeList = new ArrayList<>();
        int flag;

        if (limit == 1) {
            System.out.println("nothing to show");
        }

        for (int i = 2; i < limit; i++) {
            flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                primeList.add(i);
            }
        }

        for (int p : primeList) {
            System.out.print(p + " ");
        }
    }


}

