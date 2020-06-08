package cn.kerninventory.designmode.factorymethod;

/**
 * @author Kern
 * @date 2020/6/8 9:38
 * @description
 */
public interface Product {

    default void printProductInfo() {
        System.out.println(this.getClass().getName());
    }
}
