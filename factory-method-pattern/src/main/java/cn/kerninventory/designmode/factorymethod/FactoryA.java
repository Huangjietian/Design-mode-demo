package cn.kerninventory.designmode.factorymethod;

/**
 * @author Kern
 * @date 2020/6/8 9:39
 * @description
 */
public class FactoryA implements Factory {

    @Override
    public ProductA createProduct() {
        return new ProductA();
    }
}
