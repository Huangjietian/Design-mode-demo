package cn.kerninventory.designdemo.builder;

/**
 * @author Kern
 * @date 2020/6/8 17:08
 * @description
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA(String partA);

    public abstract void buildPartB(String partB);

    public abstract void buildPartC(String partC);

    public Product getResult() {
        return product;
    }
}
