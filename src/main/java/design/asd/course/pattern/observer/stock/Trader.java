package design.asd.course.pattern.observer.stock;

public class Trader extends Observer {

    public Trader(StockService stockService) {
        super(stockService);
    }

    public void trade(Stock stock) {
        System.out.println("Trader trade stock : " + stock.toString());
    }

    @Override
    void update() {
        Stock stock = stockService.getLastChangedStock();
        trade(stock);
    }
}
