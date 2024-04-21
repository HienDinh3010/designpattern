package design.asd.course.pattern.observer.observingmultipleevents.stockmarketobserver;

public class StockMarketView implements StockMarketObserver {

    public void showStockMarket(boolean stockMarketOpen) {
        if (stockMarketOpen) {
            System.out.println("The stock market is open");
        } else {
            System.out.println("The stock market is closed");
        }
    }

    @Override
    public void update(boolean stockMarketOpen) {
        showStockMarket(stockMarketOpen);
    }
}
