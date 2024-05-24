package design.asd.course.pattern.proxy.library;

public class Application {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        bookService.findBook("The Book Thief");
    }
}
