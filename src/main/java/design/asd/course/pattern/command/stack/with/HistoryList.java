package design.asd.course.pattern.command.stack.with;

import java.util.ArrayList;

public class HistoryList {

    private ArrayList<Command> commandList = new ArrayList<>();
    private ArrayList<Command> undoList = new ArrayList<>();

    public void undo() {
        if (commandList.size() > 0) {
            System.out.println("Undo processing:");
            int lastIndex = commandList.size() - 1;
            Command latestCommand = commandList.get(lastIndex);
            latestCommand.unExecute();
            commandList.remove(lastIndex);
            undoList.add(latestCommand);
        }
    }

    public void redo() {
        if (undoList.size() > 0) {
            System.out.println("Redo processing:");
            int lastIndex = undoList.size() - 1;
            Command latestUndoCommand = undoList.get(lastIndex);
            latestUndoCommand.execute();
            undoList.remove(lastIndex);
            commandList.add(latestUndoCommand);
        }
    }

    public void addCommand(Command commandObject) {
        commandList.add(commandObject);
    }
}
