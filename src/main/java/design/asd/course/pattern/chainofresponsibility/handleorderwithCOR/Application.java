package design.asd.course.pattern.chainofresponsibility.handleorderwithCOR;

public class Application {
    public static void main(String[] args) {
        OrderReceiver orderReceiver = new OrderReceiver();
        //Create the chain
        CompanyBTexasOrderHandler companyBTexasOrderHandler = new CompanyBTexasOrderHandler(null);
        CompanyBNewYorkOrderHandler companyBNewYorkOrderHandler = new CompanyBNewYorkOrderHandler(companyBTexasOrderHandler);
        CompanyAOrderHandler companyAOrderHandler = new CompanyAOrderHandler(companyBNewYorkOrderHandler);

        orderReceiver.setOrderHandler(companyAOrderHandler);
        orderReceiver.receiveOrder("order1.txt");
        orderReceiver.receiveOrder("order2.txt");
        orderReceiver.receiveOrder("order3.txt");
    }
}
