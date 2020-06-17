package cn.kerninventory.designdemo.decorator.exercise;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Whip extends BeverageMate {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ",奶泡";
    }

    @Override
    public int getCost() {
        return getBeverage().getCost() + 8;
    }
}
