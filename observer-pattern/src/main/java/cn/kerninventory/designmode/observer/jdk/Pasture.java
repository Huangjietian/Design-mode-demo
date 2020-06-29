package cn.kerninventory.designmode.observer.jdk;

import java.util.Observable;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Pasture extends Observable {

    public void notifyObservers(String pastureName) {
        setChanged();
        notifyObservers((Object) pastureName);
    }

    @Override
    public void notifyObservers(Object arg) {
        if (!(arg instanceof String)){
            throw new IllegalArgumentException();
        }
        super.notifyObservers(arg);
    }
}
