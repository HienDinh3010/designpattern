package design.asd.course.pattern.proxy.librarydynamicproxy;

import design.asd.course.pattern.proxy.dynamic.LoggingProxy;

import java.lang.reflect.Proxy;

public class LibraryService {

    private BookDAO bookDAO = new BookDAOImpl();
    private ClassLoader classLoaderOfBookDAO = BookDAO.class.getClassLoader();
    private BookDAO loggingProxyOfBookDAO =
            (BookDAO) Proxy.newProxyInstance(classLoaderOfBookDAO,
                    new Class[] {BookDAO.class},
                    new LoggingProxy(bookDAO));

    private CDDAO cddao = new CDDAOImpl();
    private ClassLoader classLoaderOfCDDAO = CDDAO.class.getClassLoader();
    private CDDAO loggingProxyOfCDAO =
            (CDDAO) Proxy.newProxyInstance(classLoaderOfCDDAO,
                    new Class[]{CDDAO.class},
                    new LoggingProxy(cddao));

    public Book findBook(String title) {
        return loggingProxyOfBookDAO.findBook(title);
    }

    public CD findCD(String name) {
        return loggingProxyOfCDAO.findCD(name);
    }
}
