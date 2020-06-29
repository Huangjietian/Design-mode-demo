package cn.kerninventory.desginmode.visitor;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteVisitor extends Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("对元素A的操作");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("对元素B的操作");
    }

    @Override
    public void visit(ConcreteElementC elementC) {
        System.out.println("对元素C的操作");
    }
}
