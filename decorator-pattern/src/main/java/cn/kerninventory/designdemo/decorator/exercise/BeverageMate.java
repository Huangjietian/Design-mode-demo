package cn.kerninventory.designdemo.decorator.exercise;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class BeverageMate implements Beverage {

    private Beverage beverage;

    public BeverageMate(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
