package cn.kerninventory.designmode.observer.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Pedestrian implements TrafficLightWaiter {

    private String name;

    public Pedestrian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move(boolean isRed) {
        if (isRed)
        System.out.println(getName() + "穿过人行横道");
    }
}
