package design.asd.course.pattern.proxy.cachingproxy;

import java.util.HashMap;

public class CachingProxy implements CustomerDAO {

    private CustomerDAO customerDAO;

    private HashMap<Integer, Customer> cache = new HashMap<>();

    public CachingProxy(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public Customer findCustomerById(int id) {
        Customer cacheCustomer = cache.get(id);
        if (cacheCustomer == null) {
            Customer customer = customerDAO.findCustomerById(id);
            cache.put(id, customer);
            return customer;
        }
        return cacheCustomer;
    }
}
