package design.asd.course.pattern.iterator.lesson.model;

public class Product {
    private String number;

    private String name;

    private double price;

    private boolean available;

    @Override
    public String toString() {
        return "Product{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public Product(String number, String name, double price, boolean available) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.available = available;
    }
}
