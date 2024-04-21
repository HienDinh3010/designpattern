package design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver;

import design.asd.course.pattern.observer.observingmultipleevents.Stock;

public class StockNotifier implements StockValueObserver {

    public void handleStockChange(Stock stock) {
        System.out.println("handleStockChange by doing something");
    }

    @Override
    public void update(Stock stock) {
        handleStockChange(stock);
    }
}
