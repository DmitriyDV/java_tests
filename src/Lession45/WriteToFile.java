package Lession45;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        //FileWriter file = new FileWriter("testFile", true);
        PrintWriter pw = new PrintWriter("testFile");

//        pw.write(21);
//        pw.write(33);
//        pw.close();

        int age = 25;

        pw.printf("I am %d years old.", age);
        pw.close();
    }
}
