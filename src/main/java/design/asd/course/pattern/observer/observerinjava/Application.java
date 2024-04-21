package design.asd.course.pattern.observer.observerinjava;

import java.util.Observer;

public class Application {
    public static void main(String[] args) {
        StockService stockService = new StockService();
        HistoryLogger historyLogger = new HistoryLogger();
        Trader trader = new Trader();
        stockService.addObserver(historyLogger);
        stockService.addObserver(trader);
        stockService.changeStockValue("Apple", 123);

    }
}
