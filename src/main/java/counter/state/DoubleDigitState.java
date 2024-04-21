package counter.state;

import counter.Counter;

public class DoubleDigitState extends CounterState {
    public DoubleDigitState(Counter counter) {
        super(counter);
    }

    @Override
    public void increasePoint() {
        counter.setCount(counter.getCount() + 2);
        checkForStateChange();
    }

    @Override
    public void decreasePoint() {
        counter.setCount(counter.getCount() - 2);
        checkForStateChange();
    }

    @Override
    public void checkForStateChange() {
        int count = counter.getCount();
        CounterState newState = null;
        if (count < 10) {
            newState = new SingleDigitState(counter);
        } else if (count >= 100){
            newState = new TripleDigitState(counter);
        }
        if (newState != null) {
            counter.setCounterState(newState);
        }
    }
}
