package counter.chainofreponsibility;

public class BlueHandler extends CounterValueHandler {
    public BlueHandler(CounterValueHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handleCounter(int count) {
        if ((count % 2 != 0 && count < 15) || count == 17 || count == 19) {
            System.out.println("Blue");
        } else {
            nextHandler.handleCounter(count);
        }
    }
}
