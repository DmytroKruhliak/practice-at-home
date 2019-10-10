package io.BufferedReader;

import java.io.*;

public class InputStreamReaderTest {

    public static void main(String[] args) throws IOException {


        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

//        int x = System.in.read(); // read line by symbols
//        System.out.println(x); // and output result

        BufferedReader br = new BufferedReader(inputStreamReader);

//        char c = 182;
//        System.out.println(c);
        while (true) {
            String testStr = br.readLine();
            //System.out.println((char)testStr);
            System.out.println(testStr);
        }
//        while (true) {
//            int s = inputStreamReader.read();
//            System.out.println(s);
//        }

    }
}
