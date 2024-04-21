package counter.chainofreponsibility;

public class RedHandler extends CounterValueHandler {
    
    public RedHandler(CounterValueHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handleCounter(int count) {
        if ((count % 2 == 0 && count < 10) || count == 12 || count == 13) {
            System.out.println("Red");
        } else {
            nextHandler.handleCounter(count);
        }
    }
}
