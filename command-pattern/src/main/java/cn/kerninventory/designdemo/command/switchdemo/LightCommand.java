package cn.kerninventory.designdemo.command.switchdemo;

import java.util.List;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class LightCommand implements Command {

    private volatile Light light;

    @Override
    public void execute() {
        if (light == null) {
            light = new Light();
            light.open = true;
            new Thread(light).start();
        } else {
            light.open = false;
            light = null;
        }

    }
}
