package design.asd.course.pattern.observer.stock;

public class Application {
    public static void main(String[] args) {
        StockService stockService = new StockService();
        HistoryLogger historyLogger = new HistoryLogger(stockService);
        Trader trader = new Trader(stockService);
        StockNotifier stockNotifier = new StockNotifier(stockService);

        stockService.addObserver(historyLogger);
        stockService.addObserver(trader);
        stockService.addObserver(stockNotifier);

        stockService.changeStockValue("Hien", 123);
        stockService.donotify();
        stockService.changeStockValue("Apple", 1234);
        stockService.donotify();
    }
}
