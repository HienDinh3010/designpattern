package design.asd.course.pattern.proxy.multipleproxies;


public class Application {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        Customer customer = customerService.getCustomerById(1);
        System.out.printf(customer.toString());
    }
}
