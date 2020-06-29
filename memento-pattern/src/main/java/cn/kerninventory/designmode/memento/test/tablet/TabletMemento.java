package cn.kerninventory.designmode.memento.test.tablet;

import java.io.Serializable;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class TabletMemento implements Serializable {

    private Tablet tablet;

    public TabletMemento(Tablet tablet) {
        this.tablet = tablet;
    }

    public Tablet getTablet() {
        return tablet;
    }
}
