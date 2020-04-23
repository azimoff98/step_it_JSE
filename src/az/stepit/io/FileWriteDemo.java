package az.stepit.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteDemo {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\Desktop\\myfile.txt");

        try(PrintWriter printWriter = new PrintWriter(file)){
            printWriter.println("Written by print Writer");
            printWriter.println(500);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
