package book.chapter4.control.page130_131;

import java.util.Random;

public class Exercise3_1 {
    public static void main(String[] args) {
        Random random = new Random();


        int turnsOfTheWheel = 0;

        for (int i = 0; ; i++) {
            int rnd1 = random.nextInt(1000);
            int rnd2 = random.nextInt(1000);
            int rnd3 = random.nextInt(1000);

            if (rnd2 == rnd3 && rnd3 == rnd1) {
                System.out.println("BINGO - JACKPOT!!!" + rnd1 + rnd2 + rnd3);
                System.out.println(turnsOfTheWheel);
                System.out.println("chance is: " + (double) (1 / turnsOfTheWheel));
                break;
            }
            turnsOfTheWheel++;
        }
    }
}

