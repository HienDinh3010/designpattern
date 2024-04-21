package design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver;

import design.asd.course.pattern.observer.observingmultipleevents.Stock;

public class HistoryLogger implements StockValueObserver {

    public void log(Stock stock) {
        System.out.println("log stock: " + stock.toString());
    }

    @Override
    public void update(Stock stock) {
        log(stock);
    }
}
