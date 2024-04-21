package design.asd.course.pattern.chainofresponsibility.handleorderwithoutDP;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        OrderReceiver orderReceiver = new OrderReceiver();
        try {
            orderReceiver.receiveOrder("order1.txt");
            orderReceiver.receiveOrder("order2.txt");
            orderReceiver.receiveOrder("order3.txt");
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
