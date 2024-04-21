package design.asd.course.pattern.proxy.multipleproxies;

public class LoggingProxy implements CustomerDAO {

    private CustomerDAO customerDAO;

    private Logger logger = new Logger();

    public LoggingProxy(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public Customer findCustomerById(int id) {
        Customer customer = customerDAO.findCustomerById(id);
        logger.log("Get customer by id " + id);
        return customer;
    }
}
