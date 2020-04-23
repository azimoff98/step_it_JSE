package az.stepit.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    processors > L1 > L2 > L3 > Buffer > RAM > Hard Drive
 */
public class FileInputOutputStreamDemo {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\Desktop\\books.txt");

        List<Book> books = Arrays.asList(
                new Book(1, "Book 1", "Author 1"),
                new Book(2, "Book 2", "Author 2"),
                new Book(3, "Book 3", "Author 3")
        );


        //Writing to file
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);

            for (Book book : books) {
                objectOutputStream.writeObject(book);
            }
            System.out.println("Successfully written to file");
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }finally {
            try {
                if(outputStream != null) outputStream.close();
                if(objectOutputStream != null) objectOutputStream.close();
            }catch (IOException ex){
                System.err.println(ex.getMessage());
            }
        }


        //Reading from file
        List<Book> deserialize = new ArrayList<>();

        FileInputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try{
            System.out.println("Starting reading from file");
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);

            while (true){
                Book b = (Book) objectInputStream.readObject();
                deserialize.add(b);
            }
        }catch (EOFException e){
            System.out.println("File ended");
        }catch (IOException | ClassNotFoundException e){
            System.err.println(e.getMessage());
        } finally {
            try{
                if(inputStream != null) inputStream.close();
                if(objectInputStream != null) objectInputStream.close();
            }catch (IOException e){
                System.err.println(e.getMessage());
            }
        }

        deserialize.forEach(System.out::println);

    }
}
