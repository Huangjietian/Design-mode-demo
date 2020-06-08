package cn.kerninventory.designmode.simplefactory;

import cn.kerninventory.designdemo.utils.XmlUtil;

/**
 * @author Kern
 * @date 2020/6/5 11:29
 * @description
 */
public class Client {

    public static void main(String[] args) {
        //example XML
        String productType = XmlUtil.getSimpleFactoryPatternProductType();
        Product product = Factory.getProduct(productType);
        product.printType();

        //examlpe standard
        Product productB = Factory.getProduct("B");
        productB.printType();
    }
}
