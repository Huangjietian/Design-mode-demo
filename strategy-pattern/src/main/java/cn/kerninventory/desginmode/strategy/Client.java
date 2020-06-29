package cn.kerninventory.desginmode.strategy;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy());
        context.algorithm();
    }
}
