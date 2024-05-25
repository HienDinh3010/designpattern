package design.asd.course.pattern.proxy.librarydynamicproxy;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
