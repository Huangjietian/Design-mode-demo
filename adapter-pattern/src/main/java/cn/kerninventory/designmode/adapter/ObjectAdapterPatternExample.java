package cn.kerninventory.designmode.adapter;

/**
 * <h1>中文注释</h1>
 * <p>
 *      类适配器模式示例
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class ObjectAdapterPatternExample {

    public static void main(String[] args) {
        TargetB targetB = new AdapterB();
        targetB.request();
    }
}

interface TargetB {

    void request();
}

/**
 * 通过包含适配者类成员变量实现对目标类提供适配
 */
class AdapterB implements TargetB {
    private AdapteeB adapteeB;

    public AdapterB() {
        this.adapteeB = new AdapteeB();
    }

    @Override
    public void request() {
        adapteeB.specificRequest();
    }
}

class AdapteeB {

    void specificRequest () {
        System.out.println("TODO SOMETHING!!!");
    }
}
