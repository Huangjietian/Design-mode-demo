package cn.kerninventory.designdemo.command.switchdemo;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class FanCommand implements Command {

    private Fan fan;

    @Override
    public void execute() {
        if (fan == null) {
            fan = new Fan();
            fan.open = true;
            new Thread(fan).start();
        } else {
            fan.open = false;
            fan = null;
        }
    }
}
