package cn.kerninventory.designmode.proxy.jdk;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteBizController implements BizController {
    @Override
    public void bizMethod() {
        System.out.println("实现业务方法");
    }
}
