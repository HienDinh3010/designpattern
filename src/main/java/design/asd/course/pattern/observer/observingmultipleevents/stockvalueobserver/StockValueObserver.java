package design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver;

import design.asd.course.pattern.observer.observingmultipleevents.Stock;

public interface StockValueObserver {
    public void update(Stock stock);
}
