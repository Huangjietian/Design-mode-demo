package cn.kerninventory.designdemo.decorator;

/**
 * <h1>中文注释</h1>
 * <p>
 *       具体装饰者类
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void before() {

    }

    @Override
    public void after() {

    }
}
