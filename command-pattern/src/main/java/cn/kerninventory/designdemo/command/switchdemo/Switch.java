package cn.kerninventory.designdemo.command.switchdemo;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Switch {

    private Command command;

    public Switch(Command command) {
        this.command = command;
    }

    public void switched(String message){
        System.out.println(message);
        command.execute();
    }
}
