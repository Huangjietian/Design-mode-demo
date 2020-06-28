package cn.kerninventory.designmode.interpreter.calculator;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class DoubleNode extends Node {

    public DoubleNode(String text) {
        super(text);
    }

    @Override
    public double interpret() {
        return Double.parseDouble(text);
    }
}
