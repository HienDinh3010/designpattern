package counter.chainofreponsibility;

public class CounterValueReceiver {
    
    private CounterValueHandler counterValueHandler;

    public void setCounterValueHandler(CounterValueHandler counterValueHandler) {
        this.counterValueHandler = counterValueHandler;
    }

    public void receiveCounter(int count) {
        System.out.println("Counter value changes to " + count);
        handleCounter(count);
    }

    private void handleCounter(int count) {
        counterValueHandler.handleCounter(count);
    }
}
