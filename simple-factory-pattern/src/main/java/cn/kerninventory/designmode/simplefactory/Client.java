package cn.kerninventory.designmode.simplefactory;

/**
 * @author Kern
 * @date 2020/6/5 11:29
 * @description
 */
public class Client {

    public static void main(String[] args) {
        String productType = XmlUtil.getProductType();
        Product product = Factory.getProduct(productType);
        product.printType();
    }
}
