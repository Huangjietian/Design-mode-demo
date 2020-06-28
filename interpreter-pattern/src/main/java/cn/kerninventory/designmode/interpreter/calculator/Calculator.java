package cn.kerninventory.designmode.interpreter.calculator;

import com.sun.prism.shader.Solid_TextureYV12_Loader;

import java.util.Stack;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Calculator {

    public static double calculate(String expression) {
        String[] elements = expression.split("\\s+");
        if (elements.length  % 2 != 1) {
            throw new IllegalArgumentException("Incorrect expression : " + expression);
        }
        Stack<Node> stack = new Stack<>();
        for (int i = 0 ; i < elements.length ; i += 3) {
            if (i % 2 == 0) {
                Node left = new DoubleNode(elements[i]);
                Node right = new DoubleNode(elements[i + 2]);
                Node symbol = new SymbolNode(elements[i + 1], left, right);
                stack.push(symbol);
            } else {
                Node left = stack.pop();
                Node right = new DoubleNode(elements[i + 1]);
                Node symbol = new SymbolNode(elements[i], left, right);
                stack.push(symbol);
            }
        }
        return stack.pop().interpret();
    }

    public static void main(String[] args) {
        String text = "1 + 2 * 3  / 4 + 45 * 5";
        double d = Calculator.calculate(text);
        System.out.println(d);
    }
}
