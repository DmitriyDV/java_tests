package Lession37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separetor = File.separator;
        String path = separetor+"Users"+separetor+"dmitriydrozhzhin"+separetor+"Desktop"+separetor+"test";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        //String input = scanner.nextLine();
//        while (scanner.hasNextLine()){ // пока в файле есть не прочитанные строки
//            System.out.println(scanner.nextLine());

        String line = scanner.nextLine();
        String[] numbers = line.split(" ");


        for (String number:numbers){
            Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));
            scanner.close();
        }
    }
//}
