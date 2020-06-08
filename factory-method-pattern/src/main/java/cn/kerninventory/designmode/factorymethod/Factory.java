package cn.kerninventory.designmode.factorymethod;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author Kern
 * @date 2020/6/8 9:38
 * @description
 */
public interface Factory {

    Product createProduct();

    //默认实现
    static Factory defaultFactory (){
        return new FactoryA();
    }

    //隐藏工厂方法， 直接使用工厂类来调用业务方法
//    static void printProductInfo() {
//        ServiceLoader<Factory> serviceLoader = ServiceLoader.load(Factory.class);
//        serviceLoader.reload();
//        Iterator<Factory> iterator = serviceLoader.iterator();
//        Factory factory;
//        if (iterator == null) {
//            factory = Factory.defaultFactory();
//        } else {
//            factory = iterator.next();
//        }
//        Product product = factory.createProduct();
//        product.printProductInfo();
//    }
}
