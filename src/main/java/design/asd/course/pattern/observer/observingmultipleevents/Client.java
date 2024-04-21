package design.asd.course.pattern.observer.observingmultipleevents;

import design.asd.course.pattern.observer.observingmultipleevents.stockmarketobserver.StockMarketSubject;
import design.asd.course.pattern.observer.observingmultipleevents.stockmarketobserver.StockMarketView;
import design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver.HistoryLogger;
import design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver.StockNotifier;
import design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver.StockValueSubject;
import design.asd.course.pattern.observer.observingmultipleevents.stockvalueobserver.Trader;

public class Client {
    public static void main(String[] args) {
        StockMultiService stockMultiService = new StockMultiService();

        HistoryLogger historyLogger = new HistoryLogger();
        StockNotifier stockNotifier = new StockNotifier();
        Trader trader = new Trader();
        stockMultiService.addObserver(historyLogger);
        stockMultiService.addObserver(stockNotifier);
        stockMultiService.addObserver(trader);

        StockMarketSubject stockMarketSubject = new StockMarketSubject();
        StockMarketView stockMarketView = new StockMarketView();
        stockMarketSubject.addObserver(stockMarketView);
        stockMultiService.setStockMarketSubject(stockMarketSubject);

        stockMultiService.openStockMarket();
        stockMultiService.changeStockValue("Apple", 1018);
        stockMultiService.changeStockValue("Binance", 3010);
        stockMultiService.closeStockMarket();
    }
}
