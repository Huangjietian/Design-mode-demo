package cn.kerninventory.designmode.interpreter.calculator;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class SymbolNode extends Node {

    private Node left;

    private Node right;

    public SymbolNode(String text, Node left, Node right) {
        super(text);
        this.left = left;
        this.right = right;
    }

    private SymbolNode(String text) {
        super(text);
    }

    @Override
    public double interpret() {
        if ("/".equalsIgnoreCase(text)) {
            return left.interpret() / right.interpret();
        }
        else if ("*".equalsIgnoreCase(text)) {
            return left.interpret() * right.interpret();
        }
        else if ("+".equalsIgnoreCase(text)) {
            return left.interpret() + right.interpret();
        }
        else if ("-".equalsIgnoreCase(text)) {
            return left.interpret() - right.interpret();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
