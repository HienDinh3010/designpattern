package design.asd.course.pattern.observer.observerinjava;

import java.util.Observable;

public class StockService extends Observable {
    public void changeStockValue(String stockName, double value) {
        notifyObservers();
    }
}
