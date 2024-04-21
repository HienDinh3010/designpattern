package design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver;

import design.asd.course.pattern.observer.observingmultipleevents.Stock;

import java.util.ArrayList;
import java.util.List;

public class StockValueSubject {

    List<StockValueObserver> observers = new ArrayList<>();

    public void addObserver(StockValueObserver stockValueObserver) {
        observers.add(stockValueObserver);
    }

    public void removeObserver(StockValueObserver stockValueObserver) {
        observers.remove(observers);
    }

    public void notify(Stock stock) {
        for (StockValueObserver observer: observers) {
            System.out.println("Stock is updated: " + stock.toString());
            observer.update(stock);
        }
    }
}
