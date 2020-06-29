package cn.kerninventory.desginmode.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>(16);

    public void accept(Visitor visitor) {
        elements.forEach(e -> e.accept(visitor));
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());
        objectStructure.addElement(new ConcreteElementC());
        Visitor visitor = new ConcreteVisitor();
        objectStructure.accept(visitor);
    }
}
