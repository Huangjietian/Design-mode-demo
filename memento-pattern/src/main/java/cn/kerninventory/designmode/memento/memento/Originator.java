package cn.kerninventory.designmode.memento.memento;

/**
 * <h1>中文注释</h1>
 * <p>
 *     原发器
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Originator setState(String state) {
        this.state = state;
        return this;
    }

    //创建一个备忘录对象
    public Memento createMemento(){
        return new Memento(this);
    }

    //根据备忘录对象恢复原发器状态
    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }


}
