package design.asd.course.pattern.observer.stock;

public class StockNotifier extends Observer {
    public StockNotifier(StockService stockService) {
        super(stockService);
    }

    public void handleStockChange(Stock stock) {
        System.out.println("StockNotifier notifies stock : " + stock.toString());
    }

    @Override
    void update() {
        Stock stock = stockService.getLastChangedStock();
        handleStockChange(stock);
    }
}
