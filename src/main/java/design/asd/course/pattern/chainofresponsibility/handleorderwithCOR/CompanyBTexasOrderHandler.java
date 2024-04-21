package design.asd.course.pattern.chainofresponsibility.handleorderwithCOR;

public class CompanyBTexasOrderHandler extends OrderHandler {
    public CompanyBTexasOrderHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handleOrder(String orderContent) {
        System.out.println("handler order for CompanyB from Texas");
    }
}
