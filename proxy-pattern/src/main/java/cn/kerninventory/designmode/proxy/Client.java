package cn.kerninventory.designmode.proxy;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        Subject proxy1 = new BasedInterfacesProxy(subject);
        proxy1.method();

        Subject proxy2 = new BasedClassProxy();
        proxy2.method();
    }
}
