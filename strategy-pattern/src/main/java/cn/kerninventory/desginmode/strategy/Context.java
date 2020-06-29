package cn.kerninventory.desginmode.strategy;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Context {

    private Strategy strategy;

    public Context setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public void algorithm(){
        if (strategy != null)
        strategy.algorithm();
    }
}
