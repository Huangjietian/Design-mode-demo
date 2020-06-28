package cn.kerninventory.designdemo.command;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class CommandQueue {

    private List<Command> commands = new ArrayList<>(16);

    public void addCommand(Command command){
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void batchExecute(){
        commands.forEach(e -> e.execute());
    }
}
