package cn.kerninventory.designdemo.composite.exercise;

/**
 * <h1>中文注释</h1>
 * <p>
 * 一句话描述
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Office extends Unit {

    public Office(String name) {
        super(name);
    }

    @Override
    public void issued(Document document) {
        System.out.println("办公室: [ " + getName() + " ] 收到了公文: " + document.getName());
    }
}
