package cn.kerninventory.designdemo.decorator.exercise;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        Beverage beverage2 = new Mocha(beverage1);
        Beverage beverage3 = new Milk(beverage2);
        beverage3.printReceipts();
    }
}
