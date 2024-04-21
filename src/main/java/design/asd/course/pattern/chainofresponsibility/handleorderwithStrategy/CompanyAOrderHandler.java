package design.asd.course.pattern.chainofresponsibility.handleorderwithStrategy;

public class CompanyAOrderHandler implements OrderHandler {
    @Override
    public void handleOrder(String orderContent) {
        System.out.println("handle order for CompanyA");
    }
}
