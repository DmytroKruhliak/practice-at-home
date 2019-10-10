package io.BufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        File file = new File("D:/WrittenFile.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s: list){
                bufferedWriter.write(s + "\n");
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
