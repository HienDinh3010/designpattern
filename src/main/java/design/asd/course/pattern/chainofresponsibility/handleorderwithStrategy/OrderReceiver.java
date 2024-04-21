package design.asd.course.pattern.chainofresponsibility.handleorderwithStrategy;

public class OrderReceiver {

    private OrderHandler orderHandler;

    public void setOrderHandler(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    public void handleOrder(String orderContent) {
        orderHandler.handleOrder(orderContent);
    }
}
