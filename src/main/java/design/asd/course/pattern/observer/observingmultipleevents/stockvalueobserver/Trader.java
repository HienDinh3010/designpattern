package design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver;

import design.asd.course.pattern.observer.observingmultipleevents.Stock;

public class Trader implements StockValueObserver {

    public void trade(Stock stock) {
        System.out.println("Trade stock: " + stock.toString());
    }

    @Override
    public void update(Stock stock) {
        trade(stock);
    }
}
