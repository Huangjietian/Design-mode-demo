package cn.kerninventory.designmode.simplefactory;

/**
 * @author Kern
 * @date 2020/6/5 11:25
 * @description
 */
public class ProductA implements Product {

    @Override
    public void printType() {
        System.out.println("A");
    }
}
