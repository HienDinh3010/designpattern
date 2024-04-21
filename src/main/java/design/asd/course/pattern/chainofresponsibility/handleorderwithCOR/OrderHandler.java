package design.asd.course.pattern.chainofresponsibility.handleorderwithCOR;

public abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public OrderHandler getNextHandler() {
        return nextHandler;
    }

    public OrderHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handleOrder(String orderContent);
}
