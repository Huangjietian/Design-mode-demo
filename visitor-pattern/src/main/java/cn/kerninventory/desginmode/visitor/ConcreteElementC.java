package cn.kerninventory.desginmode.visitor;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteElementC implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        System.out.println("元素C被访问者访问" + visitor.getClass().getName());
    }
}
