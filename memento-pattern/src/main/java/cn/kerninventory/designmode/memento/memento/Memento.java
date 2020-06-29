package cn.kerninventory.designmode.memento.memento;

/**
 * <h1>中文注释</h1>
 * <p>
 *     备忘录类
 *     备忘录类通常提供了与对应的原发器相对应的属性(全部或部分)
 *     需要考虑该备忘录只能被这个原发器类调用。
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Memento {

    private String state;

    Memento(Originator originator) {
        this.state = originator.getState();
    }

    Memento setState(String state) {
        this.state = state;
        return this;
    }

    String getState() {
        return state;
    }
}
