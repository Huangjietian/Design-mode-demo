package cn.kerninventory.designdemo.decorator;

/**
 * <h1>中文注释</h1>
 * <p>
 *      实现了抽象构件声明的业务方法
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("实现了抽象构件声明的业务方法");
    }
}
