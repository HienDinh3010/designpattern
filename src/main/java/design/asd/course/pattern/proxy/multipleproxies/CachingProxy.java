package design.asd.course.pattern.proxy.multipleproxies;

import java.util.HashMap;

public class CachingProxy implements CustomerDAO {

    private CustomerDAO customerDAO;

    private HashMap<Integer, Customer> cache = new HashMap<>();

    public CachingProxy(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public Customer findCustomerById(int id) {
        System.out.println("CachingProxy.findCustomerById");
        Customer cacheCustomer = cache.get(id);
        if (cacheCustomer == null) {
            System.out.println("Retrieving customer with id " + id + " from db");
            Customer customer = customerDAO.findCustomerById(id);
            cache.put(id, customer);
            return customer;
        }
        System.out.println("Found cache customer with id " + id);
        return cacheCustomer;
    }
}
