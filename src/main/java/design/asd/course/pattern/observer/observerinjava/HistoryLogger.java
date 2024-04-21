package design.asd.course.pattern.observer.observerinjava;


import java.util.Observable;
import java.util.Observer;

public class HistoryLogger implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("HistoryLogger update");
    }
}
