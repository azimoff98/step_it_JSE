package az.stepit.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderWithResource {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Desktop\\example.txt");

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            System.out.println("File not found");
        }
    }
}
