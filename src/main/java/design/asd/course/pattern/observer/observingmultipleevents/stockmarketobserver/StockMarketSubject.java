package design.asd.course.pattern.observer.observingmultipleevents.stockmarketobserver;

import java.util.ArrayList;
import java.util.List;

public class StockMarketSubject {

    List<StockMarketObserver> observers = new ArrayList<>();

    public void addObserver(StockMarketObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockMarketObserver observer) {
        observers.remove(observer);
    }

    public void notify(boolean stockMarketOpen) {
        for (StockMarketObserver observer: observers) {
            System.out.println("Notify stock market open? " + stockMarketOpen);
            observer.update(stockMarketOpen);
        }
    }
}
