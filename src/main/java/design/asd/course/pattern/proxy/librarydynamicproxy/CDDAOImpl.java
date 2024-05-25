package design.asd.course.pattern.proxy.librarydynamicproxy;

public class CDDAOImpl implements CDDAO {

    @Override
    public CD findCD(String name) {
        return new CD(name);
    }
}
