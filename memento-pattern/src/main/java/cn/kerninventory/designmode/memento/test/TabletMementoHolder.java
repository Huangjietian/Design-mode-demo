package cn.kerninventory.designmode.memento.test;

import cn.kerninventory.designmode.memento.test.tablet.TabletMemento;

import java.io.Serializable;
import java.util.Stack;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class TabletMementoHolder implements Serializable {

    private Stack<TabletMemento> tabletMementos = new Stack<>();
    private TabletMemento original;

    public void setOriginal(TabletMemento original) {
        this.original = original;
    }

    public TabletMemento getOriginal() {
        return original;
    }

    public void push(TabletMemento tabletMemento){
        tabletMementos.push(tabletMemento);
    }

    public TabletMemento pop(){
        return tabletMementos.pop();
    }


}
