package design.asd.course.pattern.command.stack.with;

import design.asd.course.pattern.command.stack.Stack;

public class Application {
    public static void main(String[] args) {
        Stack stack = new Stack();
        HistoryList historyList = new HistoryList();

        PushCommand pushCommand = new PushCommand();
        pushCommand.setStack(stack);

        pushCommand.setI(6);
        pushCommand.execute();
        historyList.addCommand(pushCommand);

        historyList.undo();
        historyList.redo();
//        pushCommand.setI(2);
//        pushCommand.execute();
//
//        pushCommand.setI(8);
//        pushCommand.execute();
//
//
//        PopCommand popCommand = new PopCommand();
//        popCommand.setStack(stack);
//        popCommand.execute();
//        popCommand.execute();
//        popCommand.execute();
    }
}
