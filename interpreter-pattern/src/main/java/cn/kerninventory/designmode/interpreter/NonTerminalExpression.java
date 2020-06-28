package cn.kerninventory.designmode.interpreter;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class NonTerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context ctx) {
        System.out.println("解释非终结符表达式");
    }
}
