package cn.kerninventory.designmode.simplefactory;

/**
 * @author Kern
 * @date 2020/6/5 11:24
 * @description
 */
public final class Factory {

    public static Product getProduct(String productType) {
        if ("A".equals(productType)) {
            return new ProductA();
        } else if ("B".equals(productType)) {
            return new ProductB();
        } else {
            throw new IllegalArgumentException("Product type " + productType + " cannot be found.");
        }
    }
}
