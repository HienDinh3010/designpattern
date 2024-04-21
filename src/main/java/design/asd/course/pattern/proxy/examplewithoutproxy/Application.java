package design.asd.course.pattern.proxy.examplewithoutproxy;

public class Application {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Customer customer = customerService.getCustomer(1);
        System.out.printf(customer.toString());
    }
}
