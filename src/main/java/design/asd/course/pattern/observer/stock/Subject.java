package design.asd.course.pattern.observer.stock;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void donotify() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

}
