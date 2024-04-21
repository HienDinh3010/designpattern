package design.asd.course.pattern.command.stack.with;

import design.asd.course.pattern.command.stack.Stack;

public class PushCommand implements Command {

    private Stack stack;

    private Integer i;

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Stack getStack() {
        return stack;
    }

    @Override
    public void execute() {
        stack.push(i);
    }

    @Override
    public void unExecute() {
        stack.pop();
    }
}
