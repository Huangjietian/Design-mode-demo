package cn.kerninventory.designmode.observer.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Car implements TrafficLightWaiter {

    private Pedestrian driver;
    private String brand;

    public Car(Pedestrian driver, String brand) {
        this.driver = driver;
        this.brand = brand;
    }

    public Pedestrian getDriver() {
        return driver;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void move(boolean isRed) {
        if (!isRed)
        System.out.println("司机" + driver.getName() + "驾驶" + brand + "汽车穿过路口" );
    }
}
