package design.asd.course.pattern.iterator.assigment.customers;

import java.util.List;
import java.util.function.Predicate;

public class FilterIterator<T> implements Iterator<T> {

    private List<T> list;

    private Predicate<T> predicate;

    private int position;

    public FilterIterator(List<T> list, Predicate<T> predicate) {
        this.list = list;
        this.predicate = predicate;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        int tempPosition = position;
        while (tempPosition < list.size()) {
            T nextElement = list.get(tempPosition);
            if (predicate.test(nextElement)) {
                return true;
            } else {
                tempPosition++;
            }
        }
        return false;
    }

    @Override
    public T next() {
        int tempPosition = position;
        while (tempPosition < list.size()) {
            T nextElement = list.get(tempPosition);
            if (predicate.test(nextElement)) {
                position = tempPosition + 1;
                return nextElement;
            } else {
                tempPosition++;
            }
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
