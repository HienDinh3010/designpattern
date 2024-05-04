package design.asd.course.pattern.decorator.javacollection;

import java.util.Collection;

public interface DecoratedCollection<T> extends Collection<T> {
    void customMethod();
}
