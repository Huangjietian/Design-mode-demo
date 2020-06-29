package cn.kerninventory.desginmode.strategy;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteStrategy implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("算法1");
    }
}
