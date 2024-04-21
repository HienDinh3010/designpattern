package counter.state;

import counter.Counter;

public class SingleDigitState extends CounterState {

    public SingleDigitState(Counter counter) {
        super(counter);
    }

    @Override
    public void increasePoint() {
        counter.setCount(counter.getCount() + 1);
        checkForStateChange();
    }

    @Override
    public void decreasePoint() {
        counter.setCount(counter.getCount() - 1);
        checkForStateChange();
    }

    @Override
    public void checkForStateChange() {
        int count = counter.getCount();
        if (count >= 10 && count < 100) {
            CounterState newState = new DoubleDigitState(counter);
            counter.setCounterState(newState);
        }
    }
}
