package cn.kerninventory.designmode.interpreter.calculator;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class Node {

    protected String text;

    public Node(String text) {
        this.text = text;
    }

    public abstract double interpret();
}
