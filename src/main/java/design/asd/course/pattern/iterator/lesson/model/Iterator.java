package design.asd.course.pattern.iterator.lesson.model;

public interface Iterator<T> {
    public boolean hasNext();

    public T next();

    public void remove();
}
