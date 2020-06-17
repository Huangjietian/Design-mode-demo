package cn.kerninventory.designdemo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>中文注释</h1>
 * <p>
 * 一句话描述
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Composite extends Component {

    public List<Component> childs = new ArrayList<>(16);

    @Override
    public void add(Component c) {
        childs.add(c);
    }

    @Override
    public void remove(Component c) {
        childs.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return childs.get(i);
    }

    @Override
    public void operation() {
        childs.forEach(Component::operation);
    }
}
