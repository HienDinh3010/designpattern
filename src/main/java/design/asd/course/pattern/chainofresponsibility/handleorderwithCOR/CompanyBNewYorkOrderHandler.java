package design.asd.course.pattern.chainofresponsibility.handleorderwithCOR;

public class CompanyBNewYorkOrderHandler extends OrderHandler {
    public CompanyBNewYorkOrderHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handleOrder(String orderContent) {
        if (!orderContent.startsWith("CompanyA") &&
                orderContent.lastIndexOf("New York") != -1) {
            System.out.println("handler order for CompanyB from New York");
        } else {
            nextHandler.handleOrder(orderContent);
        }
    }
}
