package cn.kerninventory.designdemo.builder;

/**
 * @author Kern
 * @date 2020/6/8 17:12
 * @description
 */
public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPartA(String partA) {
        product.setPartA(partA);
    }

    @Override
    public void buildPartB(String partB) {
        product.setPartB(partB);
    }

    @Override
    public void buildPartC(String partC) {
        product.setPartC(partC);
    }
}
