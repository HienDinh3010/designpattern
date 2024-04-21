package counter.chainofreponsibility;

public abstract class CounterValueHandler {
    protected CounterValueHandler nextHandler;

    public CounterValueHandler(CounterValueHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void setNextHandler(CounterValueHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handleCounter(int count);
}
