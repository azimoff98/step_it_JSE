package az.stepit.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorDemo {
    public static void main(String[] args) {
        Book book1 = new Book(1L,"book1", "author1", 6.8, 14.3);
        Book book2 = new Book(2L,"book2", "author2", 9.1, 6.5);
        Book book3 = new Book(3L,"book3", "author3", 7.5, 8.0);
        Book book4 = new Book(4L,"book4", "author4", 7.5, 11.2);

        List<Book> books = Arrays.asList(book1, book2, book3, book4);

        List<Book> sorted = books.stream()
                .sorted(
                        Comparator.comparingDouble(Book::getRanking)
                        .thenComparing(Book::getId)
                )
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}
