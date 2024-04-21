package design.asd.course.pattern.observer.observingmultipleevents;

import design.asd.course.pattern.observer.observingmultipleevents.stockmarketobserver.StockMarketSubject;
import design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver.StockValueSubject;

public class StockMultiService extends StockValueSubject {

    private boolean stockMarketOpen = false;

    public StockMarketSubject getStockMarketSubject() {
        return stockMarketSubject;
    }

    public void setStockMarketSubject(StockMarketSubject stockMarketSubject) {
        this.stockMarketSubject = stockMarketSubject;
    }

    private StockMarketSubject stockMarketSubject;

    public void changeStockValue(String stockName, double value) {
        Stock stock = new Stock(stockName, value);
        notify(stock);
    }

    public void openStockMarket() {
        stockMarketOpen = true;
        stockMarketSubject.notify(stockMarketOpen);
    }

    public void closeStockMarket() {
        stockMarketOpen = false;
        stockMarketSubject.notify(stockMarketOpen);
    }
}
