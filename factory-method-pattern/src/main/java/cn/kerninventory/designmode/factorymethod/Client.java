package cn.kerninventory.designmode.factorymethod;

import com.sun.xml.internal.ws.util.xml.XmlUtil;

/**
 * @author Kern
 * @date 2020/6/8 9:40
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product product = factory.createProduct();
        product.printProductInfo();
    }
}
