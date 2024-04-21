package design.asd.course.pattern.proxy.examplewithoutproxy;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public Customer findCustomerById(int id) {
        return new Customer(id, "John Doe");
    }
}
