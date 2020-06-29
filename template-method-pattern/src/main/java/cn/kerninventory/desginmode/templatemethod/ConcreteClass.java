package cn.kerninventory.desginmode.templatemethod;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteClass extends AbstractTempalate {
    @Override
    protected void abstractMethod() {
        System.out.println("抽象方法的实现");
    }

    @Override
    protected boolean hookMethod() {
        System.out.println("钩子方法的重写来实现对父类流程的控制, 在设计模板方法时要充分考虑钩子的设计");
        return false;
    }
}
