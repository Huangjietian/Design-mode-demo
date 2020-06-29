package cn.kerninventory.designmode.memento.caretaker;

import cn.kerninventory.designmode.memento.memento.Memento;

/**
 * <h1>中文注释</h1>
 * <p>
 *     负责人,负责备忘录的保存
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public Caretaker setMemento(Memento memento) {
        this.memento = memento;
        return this;
    }
}
