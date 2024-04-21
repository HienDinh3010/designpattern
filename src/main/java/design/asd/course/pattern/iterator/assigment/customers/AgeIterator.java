package design.asd.course.pattern.iterator.assigment.customers;

import java.util.Comparator;
import java.util.List;

public class AgeIterator<T> implements Iterator<T> {

    private final List<Customer> list;

    private int position;

    public AgeIterator(List<Customer> list) {
        this.list = list;
        this.position = 0;
        if (!list.isEmpty()) {
            this.list.sort(Comparator.comparingInt(Customer::getAge));
        }
    }

    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        if (this.position < list.size()) {
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if (hasNext()) {
            T customer = (T) list.get(position);
            position++;
            return customer;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
