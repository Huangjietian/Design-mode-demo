package cn.kerninventory.designmode.observer.test;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class TrafficLight {

    private String crossingName;

    protected List<TrafficLightWaiter> waiters = new ArrayList<>(16);

    public String getCrossingName() {
        return crossingName;
    }

    public TrafficLight(String crossingName) {
        this.crossingName = crossingName;
    }

    public void await(TrafficLightWaiter trafficLightWaiter) {
        waiters.add(trafficLightWaiter);
    }

    public abstract void notified(final boolean isRed);

}
