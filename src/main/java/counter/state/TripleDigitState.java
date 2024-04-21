package counter.state;

import counter.Counter;

public class TripleDigitState extends CounterState {

    public TripleDigitState(Counter counter) {
        super(counter);
    }

    @Override
    public void increasePoint() {
        counter.setCount(counter.getCount() + 3);
        checkForStateChange();
    }

    @Override
    public void decreasePoint() {
        counter.setCount(counter.getCount() - 3);
        checkForStateChange();
    }

    @Override
    public void checkForStateChange() {
        if (counter.getCount() < 100) {
            CounterState newState = new DoubleDigitState(counter);
            counter.setCounterState(newState);
        }
    }
}
