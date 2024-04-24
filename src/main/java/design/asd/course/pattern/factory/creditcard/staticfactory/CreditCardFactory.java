package design.asd.course.pattern.factory.creditcard.staticfactory;

import design.asd.course.pattern.factory.creditcard.model.CreditCard;

public class CreditCardFactory {
    static CreditCard getCreditCardInstance(String type, String number, double limit,
                                            double annualCharge) {
        return new CreditCard(type, number, limit, annualCharge);
    }
}
