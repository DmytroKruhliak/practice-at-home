package io.BufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        try {
            File file = new File("D:/Test123.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String output;
            while((output = bufferedReader.readLine()) != null) {
                System.out.println(output);
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
