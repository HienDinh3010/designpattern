package design.asd.course.pattern.proxy.cachingproxy;

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
