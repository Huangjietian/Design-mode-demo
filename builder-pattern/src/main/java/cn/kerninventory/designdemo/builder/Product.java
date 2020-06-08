package cn.kerninventory.designdemo.builder;

/**
 * @author Kern
 * @date 2020/6/8 17:08
 * @description
 */
public class Product {

    private String partA;

    private String partB;

    private String partC;

    public String getPartA() {
        return partA;
    }

    public Product setPartA(String partA) {
        this.partA = partA;
        return this;
    }

    public String getPartB() {
        return partB;
    }

    public Product setPartB(String partB) {
        this.partB = partB;
        return this;
    }

    public String getPartC() {
        return partC;
    }

    public Product setPartC(String partC) {
        this.partC = partC;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
}
