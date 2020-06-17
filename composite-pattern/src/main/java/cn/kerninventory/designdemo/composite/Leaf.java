package cn.kerninventory.designdemo.composite;

/**
 * <h1>中文注释</h1>
 * <p>
 * 一句话描述
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Leaf extends Component {
    @Override
    public void add(Component c) {
        throw new IllegalArgumentException("叶子对象无法执行该方法");
    }

    @Override
    public void remove(Component c) {
        throw new IllegalArgumentException("叶子对象无法执行该方法");
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("业务代码执行");
    }
}
