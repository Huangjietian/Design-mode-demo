package cn.kerninventory.designmode.observer.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class TwoColorTrafficLight extends TrafficLight {

    public TwoColorTrafficLight(String crossingName) {
        super(crossingName);
    }

    @Override
    public void notified(final boolean isRed) {
        waiters.forEach(e -> {
            e.move(isRed);
        });
    }
}
