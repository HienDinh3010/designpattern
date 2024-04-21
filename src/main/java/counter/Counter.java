package counter;

import counter.database.DatabaseService;
import counter.state.CounterState;

public class Counter extends Subject {

    private final DatabaseService databaseService = new DatabaseService();
    private TextFrame textframe;
    private RectFrame rectframe;
    private OvalFrame ovalframe;

    private CounterState counterState;

    public int getCount() {
        return databaseService.getCount();
    }

    public void setCount(int count) {
        this.databaseService.setCount(count);
    }

    public CounterState getCounterState() {
        return counterState;
    }

    public void setCounterState(CounterState counterState) {
        this.counterState = counterState;
    }

    public void increment() {
        //count++;
        counterState.increasePoint();
        textframe.setCount(databaseService.getCount());
        rectframe.setCount(databaseService.getCount());
        ovalframe.setCount(databaseService.getCount());
        doNotify();
    }

    public void decrement() {
        //count--;
        counterState.decreasePoint();
        textframe.setCount(databaseService.getCount());
        rectframe.setCount(databaseService.getCount());
        ovalframe.setCount(databaseService.getCount());
        doNotify();
    }

    public void setTextframe(TextFrame textframe) {
        this.textframe = textframe;
    }

    public void setRectframe(RectFrame rectframe) {
        this.rectframe = rectframe;
    }

    public void setOvalframe(OvalFrame ovalframe) {
        this.ovalframe = ovalframe;
    }

    @Override
    public void doNotify() {
        System.out.println("doNotify for current count: " + databaseService.getCount());
        for (Observer observer : observers) {
            observer.setCount(databaseService.getCount());
            //System.out.println(observer.toString());
        }
    }
}
