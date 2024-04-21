package counter.state;

import counter.Counter;

public abstract class CounterState {
    protected Counter counter;

    public CounterState(Counter counter) {
        this.counter = counter;
    }

    public abstract void increasePoint();

    public abstract void decreasePoint();

    public abstract void checkForStateChange();
}
