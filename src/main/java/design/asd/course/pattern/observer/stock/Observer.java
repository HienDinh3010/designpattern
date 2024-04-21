package design.asd.course.pattern.observer.stock;

public abstract class Observer {

    protected StockService stockService;

    public Observer(StockService stockService) {
        this.stockService = stockService;
    }

    abstract void update();
}
