package cn.kerninventory.designdemo.decorator;

/**
 * <h1>中文注释</h1>
 * <p>
 *       抽象装饰者类
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class Decorator extends Component {

    /**
     * 保有一个抽象构件的引用，以实现其基本的业务方法
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        before();
        //调用原有的业务方法
        component.operation();
        after();
    }

    public abstract void before();

    public abstract void after();
}
