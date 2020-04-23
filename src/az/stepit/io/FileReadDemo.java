package az.stepit.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Desktop\\myfile.txt");

        Scanner scanner = null;
        try {
            scanner =  new Scanner(file);

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(scanner != null)
                scanner.close();
        }
    }
}
