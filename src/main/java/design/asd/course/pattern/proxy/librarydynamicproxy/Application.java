package design.asd.course.pattern.proxy.librarydynamicproxy;

public class Application {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        libraryService.findBook("The Book Thief");
        libraryService.findCD("50 first dates");
    }
}
