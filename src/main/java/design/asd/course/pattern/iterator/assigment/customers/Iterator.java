package design.asd.course.pattern.iterator.assigment.customers;

public interface Iterator<T> {
    boolean hasNext();

    T next();

    void remove();
}
