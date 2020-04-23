package az.stepit.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\User\\Desktop\\nio.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message: ");
        String context = scanner.nextLine();

        Files.write(path, context.getBytes());

        String readContext = new String(Files.readAllBytes(path));

        System.out.println(readContext);
    }
}
