package book.chapter4.control.page130_131;

import java.util.ArrayList;

public class Exercise4simpleNumb {
    public static void main(String[] args) {

//        for (int i = 2; i < 100; i++) {
//            for (int j = 2; j < 100; j++) {
//                if (i == 2) break;
//                if ((i % j == 0) && (i != j)) {
//                    break;
//                } else {
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }
        getPrimeNumbList(100);
    }

    private static void getPrimeNumbList(int limit) {
        ArrayList<Integer> primeList = new ArrayList<>();
        int flag;

        if (limit == 1) {
            System.out.println("nothing to show");
        }

        for (int i = 2; i < limit; i++) {
            flag = 0;
            for (int j = 2; j < Math.sqrt(i); j++) {
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
            System.out.println(p);
        }
    }

}

