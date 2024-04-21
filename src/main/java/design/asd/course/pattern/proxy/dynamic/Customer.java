package design.asd.course.pattern.proxy.dynamic;

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
