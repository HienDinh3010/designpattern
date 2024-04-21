package counter.chainofreponsibility;

public class GreenHandler extends CounterValueHandler {
    
    public GreenHandler(CounterValueHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handleCounter(int count) {
        if (count % 2 == 0 && count >= 10 && count != 12 && count != 13) {
            System.out.println("Green");
        } else {
            nextHandler.handleCounter(count);
        }
    }
}
