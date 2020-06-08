package cn.kerninventory.designdemo.builder;

/**
 * @author Kern
 * @date 2020/6/8 17:16
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder1();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.toString());
    }
}
