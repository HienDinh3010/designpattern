package design.asd.course.pattern.proxy.cachingproxy;

public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAOImpl();

    private CachingProxy cachingProxy = new CachingProxy(customerDAO);

    public Customer getCustomer(Integer customerId) {
        return cachingProxy.findCustomerById(customerId);
    }
}
