package cn.kerninventory.designmode.proxy;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class SubjectImpl implements Subject {
    @Override
    public void method() {
        System.out.println("执行业务代码");
    }
}
