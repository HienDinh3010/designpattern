package design.asd.course.pattern.observer.stock;

public class StockService extends Subject {

    private Stock lastChangedStock;

    public void changeStockValue(String stockName, double value) {
        lastChangedStock = new Stock(stockName, value);
        //donotify();
    }

    public Stock getLastChangedStock() {
        return lastChangedStock;
    }
}
