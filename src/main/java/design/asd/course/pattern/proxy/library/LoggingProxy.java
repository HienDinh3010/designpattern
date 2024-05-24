package design.asd.course.pattern.proxy.library;

public class LoggingProxy implements BookDAO {

    private BookDAO bookDAO;

    public LoggingProxy(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public Book findBook(String title) {
        System.out.println("Looking for book with title: " + title);
        Book book = bookDAO.findBook(title);
        return book;
    }
}
