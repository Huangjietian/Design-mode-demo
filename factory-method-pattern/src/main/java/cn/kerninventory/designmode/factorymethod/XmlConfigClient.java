package cn.kerninventory.designmode.factorymethod;

import cn.kerninventory.designdemo.utils.XmlUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Kern
 * @date 2020/6/8 9:47
 * @description
 */
public class XmlConfigClient {

    public static void main(String[] args)  {
        Factory factory;
        try {
            String factoryName = XmlUtil.getFactoryMethodPatternFactoryName();
            if (factoryName == null || factoryName.trim().equals("")) {
                factory = Factory.defaultFactory();
            } else {
                Class factoryClass = Class.forName(factoryName);
                factory = (Factory) factoryClass.getConstructor().newInstance();
            }
        } catch (Exception e) {
            System.out.println("初始化工厂失败");
            throw new RuntimeException("初始化工厂失败");
        }
        Product product = factory.createProduct();
        product.printProductInfo();
    }
}
