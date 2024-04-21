package design.asd.course.pattern.chainofresponsibility.handleorderwithCOR;

public class OrderReceiver {
    private OrderHandler orderHandler;

    public void setOrderHandler(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    public void receiveOrder(String fileName) {
        FileReader fileReader = new FileReader();
        String orderContent = fileReader.getStringFromFile(fileName);
        handlerOrder(orderContent);
    }

    private void handlerOrder(String orderContent) {
        orderHandler.handleOrder(orderContent);
    }
}
