package design.asd.course.pattern.proxy.dynamic;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public Customer findCustomerById(int id) {
        return new Customer(id, "John Doe");
    }
}
