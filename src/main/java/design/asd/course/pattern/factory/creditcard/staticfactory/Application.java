package design.asd.course.pattern.factory.creditcard.staticfactory;

import design.asd.course.pattern.factory.creditcard.model.CreditCard;

public class Application {
    public static void main(String[] args) {
        CreditCard creditCard = CreditCardFactory.getCreditCardInstance("visa",
                "10293847", 2500.0, 10);
    }
}
