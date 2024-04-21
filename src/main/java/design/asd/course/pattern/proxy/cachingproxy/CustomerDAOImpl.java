package design.asd.course.pattern.proxy.cachingproxy;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public Customer findCustomerById(int id) {
        return new Customer(id, "John Doe");
    }
}
