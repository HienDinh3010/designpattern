package design.asd.course.pattern.command.stack.with;

import design.asd.course.pattern.command.stack.Stack;

public class PopCommand implements Command {

    private Stack stack;

    private Integer i;

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public Integer getI() {
        return i;
    }

    @Override
    public void execute() {
        i = stack.pop();
    }

    @Override
    public void unExecute() {
        stack.push(i);
    }
}
