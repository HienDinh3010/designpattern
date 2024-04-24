package design.asd.course.pattern.factory.creditcard.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCard {
    private String type;
    private String number;
    private double limit;
    private double annualCharge;
}
