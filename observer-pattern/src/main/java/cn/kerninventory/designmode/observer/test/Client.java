package cn.kerninventory.designmode.observer.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        TrafficLight trafficLight = new TwoColorTrafficLight("New Street Crossing");
        System.out.println(trafficLight.getCrossingName());
        trafficLight.notified(false);
        Thread.sleep(1000L);
        trafficLight.await(new Car(new Pedestrian("Kern"),"Benz"));
        trafficLight.await(new Car(new Pedestrian("Jack"),"BMW"));
        trafficLight.await(new Car(new Pedestrian("Mina"),"vw"));
        trafficLight.await(new Pedestrian("Tom"));
        trafficLight.await(new Pedestrian("Cayre"));
        trafficLight.await(new Pedestrian("Mark"));
        trafficLight.notified(true);
        Thread.sleep(1000L);
        trafficLight.notified(false);
        Thread.sleep(1000L);

    }
}
