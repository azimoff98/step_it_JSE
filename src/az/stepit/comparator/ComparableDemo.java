package az.stepit.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,2,3,4,9,25,1,5,12,6);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
//        sortedList.forEach(System.out::println);

        Book book1 = new Book(1L,"book1", "author1", 6.8, 14.3);
        Book book2 = new Book(2L,"book2", "author2", 9.1, 6.5);
        Book book3 = new Book(3L,"book3", "author3", 4.2, 8.0);
        Book book4 = new Book(4L,"book4", "author4", 7.5, 11.2);

        List<Book> books = Arrays.asList(book1, book2, book3, book4);

        List<Book> sortedBooks = books.stream().sorted().collect(Collectors.toList());

        sortedBooks.forEach(System.out::println);

        //remaining  coming
        //if remaining > return 1
        //if coming > return -1
        //if equals 0
    }
}
