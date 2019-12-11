package book.chapter4.control.page130_131;

import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; ; i++) {
            int rnd1 = rand.nextInt(25);
            int rnd2 = rand.nextInt(25);

            if (rnd1 > rnd2)
                System.out.println(rnd1 + " > " + rnd2);
            else if (rnd1 < rnd2)
                System.out.println(rnd1 + " < " + rnd2);
            else
                System.out.println(rnd1 + " are equals " + rnd2);

        }
    }
}