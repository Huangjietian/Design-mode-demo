package cn.kerninventory.designdemo.decorator.exercise;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "混合咖啡";
    }

    @Override
    public int getCost() {
        return 30;
    }
}
