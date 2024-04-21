package design.asd.course.pattern.proxy.multipleproxies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Customer {
    private int customerId;
    private String name;
}
