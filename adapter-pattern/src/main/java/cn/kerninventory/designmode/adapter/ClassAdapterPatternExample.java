package cn.kerninventory.designmode.adapter;

import com.sun.xml.internal.bind.v2.model.core.Adapter;

/**
 * <h1>中文注释</h1>
 * <p>
 *      类适配器模式示例
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class ClassAdapterPatternExample {

    public static void main(String[] args) {
        TargetA targetA = new AdapterA();
        targetA.request();
    }
}

interface TargetA {

    void request() ;

}

/**
 * 通过继承关系实现适配目的,
 * 实现了目标类抽象接口，同时继承了适配者类
 */
class AdapterA extends AdapteeA implements TargetA {

    @Override
    public void request() {
        super.specificRequest();
    }
}

class AdapteeA {

    protected void specificRequest() {
        System.out.println("TODO SOMETHING");
    }
}
