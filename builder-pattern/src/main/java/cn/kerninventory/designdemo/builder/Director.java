package cn.kerninventory.designdemo.builder;

/**
 * @author Kern
 * @date 2020/6/8 17:14
 * @description
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Director setBuilder(Builder builder) {
        this.builder = builder;
        return this;
    }

    //产品构建与组装方法
    public Product construct(){
        builder.buildPartA("A");
        builder.buildPartB("B");
        builder.buildPartC("C");
        return builder.getResult();
    }
}
