package design.asd.course.pattern.proxy.library;

public class SetAvailableProxy implements BookDAO {

    private BookDAO bookDAO;

    public SetAvailableProxy(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public Book findBook(String title) {
        Book book = bookDAO.findBook(title);
        book.setAvailable(true);
        return book;
    }
}
