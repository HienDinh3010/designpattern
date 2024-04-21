package design.asd.course.pattern.proxy.multipleproxies;

public class StopWatchProxy implements CustomerDAO {

    private CustomerDAO customerDAO;

    private StopWatch stopWatch;

    public StopWatchProxy(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public Customer findCustomerById(int id) {
        stopWatch = new StopWatch();
        stopWatch.start();
        Customer customer = customerDAO.findCustomerById(id);
        stopWatch.stop();
        System.out.println("[StopWatchProxy] get customer takes time: " + stopWatch.getElapsedTime());
        return customer;
    }
}
