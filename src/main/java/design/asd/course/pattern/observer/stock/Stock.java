package design.asd.course.pattern.observer.stock;

public class Stock {
    private String stockName;

    private double value;

    public Stock(String stockName, double value) {
        this.stockName = stockName;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", value=" + value +
                '}';
    }
}
