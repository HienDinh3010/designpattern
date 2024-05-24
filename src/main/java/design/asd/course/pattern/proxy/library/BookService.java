package design.asd.course.pattern.proxy.library;

public class BookService {

    private BookDAO bookDAO = new BookDAOImpl();
    private BookDAO loggingProxy = new LoggingProxy(bookDAO);
    private BookDAO setAvailableProxy = new SetAvailableProxy(loggingProxy);

    public Book findBook(String title) {
        Book book = setAvailableProxy.findBook(title);
        System.out.println("Set available for book");
        return book;
    }
}
