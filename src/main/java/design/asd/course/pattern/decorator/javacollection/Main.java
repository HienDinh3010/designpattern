package design.asd.course.pattern.decorator.javacollection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a decorated collection
        DecoratedCollection<String> decoratedCollection = new CustomCollectionDecorator<>(new ArrayList<>());

        // Add elements to the decorated collection
        decoratedCollection.add("Element 1");
        decoratedCollection.add("Element 2");

        // Call custom method
        decoratedCollection.customMethod();

        // Iterate over elements
        for (String element : decoratedCollection) {
            System.out.println(element);
        }
    }
}