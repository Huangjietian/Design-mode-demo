package cn.kerninventory.designmode.observer.jdk;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Pasture pasture = new Pasture();

        pasture.addObserver(new Cow());
        pasture.addObserver(new Sheep());
        pasture.notifyObservers("大草场");
    }
}
