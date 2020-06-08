package cn.kerninventory.designmode.factorymethod;

/**
 * @author Kern
 * @date 2020/6/8 10:21
 * @description
 */
public class FactoryB implements Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
