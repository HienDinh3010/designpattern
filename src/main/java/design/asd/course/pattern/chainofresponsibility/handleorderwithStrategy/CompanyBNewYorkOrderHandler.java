package design.asd.course.pattern.chainofresponsibility.handleorderwithStrategy;

public class CompanyBNewYorkOrderHandler implements OrderHandler {
    @Override
    public void handleOrder(String orderContent) {
        System.out.println("handle order for CompanyB from New York");
    }
}
