package cn.kerninventory.designmode.observer;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notified() {
        observers.forEach(e -> e.update());
    }
}
