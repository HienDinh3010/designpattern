package counter.chainofreponsibility;

public class OrangeHandler extends CounterValueHandler {
    
    public OrangeHandler(CounterValueHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handleCounter(int count) {
        if (count % 2 != 0 && count >= 15 && count != 17 && count != 19) {
            System.out.println("Orange");
        } else {
            nextHandler.handleCounter(count);
        }
    }
}
