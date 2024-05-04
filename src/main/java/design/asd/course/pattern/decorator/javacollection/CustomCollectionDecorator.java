package design.asd.course.pattern.decorator.javacollection;

import java.util.Collection;
import java.util.Iterator;

class CustomCollectionDecorator<T> implements DecoratedCollection<T> {

    private Collection<T> decoratedCollection;

    public CustomCollectionDecorator(Collection<T> decoratedCollection) {
        this.decoratedCollection = decoratedCollection;
    }

    // Methods from Collection interface
    @Override
    public int size() {
        return decoratedCollection.size();
    }

    @Override
    public boolean isEmpty() {
        return decoratedCollection.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    // Add custom method
    @Override
    public void customMethod() {
        System.out.println("Custom method executed!");
    }

    // Other methods from Collection interface (not implemented here for brevity)

    // Iterator method
    @Override
    public Iterator<T> iterator() {
        return decoratedCollection.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    // Other methods from Collection interface (not implemented here for brevity)
}
