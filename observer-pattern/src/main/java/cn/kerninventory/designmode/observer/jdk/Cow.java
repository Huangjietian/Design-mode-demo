package cn.kerninventory.designmode.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Cow implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("牛去吃草了" + arg.toString());
    }
}
