package cn.kerninventory.desginmode.visitor;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public interface Element {

    void accept(Visitor visitor);
}
