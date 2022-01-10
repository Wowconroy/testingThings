package ua.com.collections;

import java.util.*;

public class SecondMap {
    public static void main(String[] args) {
//        Map.Entry<String, Book> tuple;
//        tuple = new AbstractMap.SimpleEntry<>("Horor", new Book("The Black Swan", "Nasim T."));

        List<Map.Entry<String, Book>> lisrOfBooks = new ArrayList<>();
 //       lisrOfBooks.add(tuple);

        lisrOfBooks.add(new AbstractMap.SimpleEntry<>
                ("Comedy", new Book("Life Of Crazy Cat", "Frosiia Cat")));
        lisrOfBooks.add(new AbstractMap.SimpleEntry<>
                ("Comedy", new Book("Oleksii's Story", "Oleksii Sh.")));

        lisrOfBooks.forEach(System.out::println);
    }

}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}