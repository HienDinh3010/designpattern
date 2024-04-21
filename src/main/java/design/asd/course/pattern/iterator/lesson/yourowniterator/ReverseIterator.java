package design.asd.course.pattern.iterator.lesson.yourowniterator;

import design.asd.course.pattern.iterator.lesson.model.Iterator;

import java.util.List;

public class ReverseIterator<T> implements Iterator<T> {

    private final List<T> list;

    private int position;

    public ReverseIterator(List<T> list) {
        this.list = list;
        this.position = list.size() - 1;
    }

    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public T next() {
        return list.get(position--);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
