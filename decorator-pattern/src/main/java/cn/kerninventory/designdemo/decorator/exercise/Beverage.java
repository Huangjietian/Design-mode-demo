package cn.kerninventory.designdemo.decorator.exercise;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public interface Beverage {

    String getDescription() ;

    int getCost();


    default void printReceipts() {
        System.out.println(getDescription() + " ￥" + getCost());
    }
}
