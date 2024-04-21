package design.asd.course.pattern.proxy.examplewithoutproxy;

public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAOImpl();

    public Customer getCustomer(int customerId) {
        return customerDAO.findCustomerById(customerId);
    }
}
