package cn.kerninventory.designmode.factorymethod;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author Kern
 * @date 2020/6/8 10:14
 * @description
 */
public class ServiceLoaderConfigClient {

    public static void main(String[] args) {
        ServiceLoader<Factory> serviceLoader = ServiceLoader.load(Factory.class);
        serviceLoader.reload();
        Iterator<Factory> iterator = serviceLoader.iterator();
        Factory factory;
        if (iterator == null) {
            factory = Factory.defaultFactory();
        } else {
            factory = iterator.next();
        }
        Product product = factory.createProduct();
        product.printProductInfo();
    }
}
