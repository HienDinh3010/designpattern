package design.asd.course.pattern.proxy.library;

import java.util.UUID;

public class BookDAOImpl implements BookDAO {
    @Override
    public Book findBook(String title) {
        Book book = new Book(UUID.randomUUID().toString(), title, title + " author");
        System.out.println("Found Book title: " + title);
        return book;
    }
}
