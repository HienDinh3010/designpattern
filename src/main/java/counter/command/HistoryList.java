package counter.command;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {

    List<Command> commands = new ArrayList<>();

    List<Command> undoCommands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            int lastIndex = commands.size() - 1;
            Command command = commands.get(lastIndex);
            command.unExecute();
            commands.remove(lastIndex);
            undoCommands.add(command);
        }
    }

    public void redo() {
        if (!undoCommands.isEmpty()) {
            int lastIndex = undoCommands.size() - 1;
            Command command = undoCommands.get(lastIndex);
            command.execute();
            undoCommands.remove(lastIndex);
            commands.add(command);
        }
    }
}
