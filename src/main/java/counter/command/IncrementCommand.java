package counter.command;

import counter.Counter;

public class IncrementCommand implements Command {

    private final Counter counter;

    public IncrementCommand(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void execute() {
        counter.increment();
    }

    @Override
    public void unExecute() {
        counter.decrement();
    }
}
