package cn.kerninventory.designmode.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 实际是 Proxy.newProxyInstance 构建了一个继承了 Proxy 并实现了 入参所表示接口的 Proxy 子类，以下表示SubProxy
         * SubProxy 持有 成员变量 InvocationHandler， InvocationHanlder调用处理类是代理的具体织入(逻辑实现)
         * 最终执行了业务方法将直接调用 invocationHandler#invoke{proxy,method,args}；
         * 生成的代理类中代码为 super.h.invoke(this,m3,(Object[])null);
         */
        InvocationHandler handler = new BizLogInvocationHandler(new ConcreteBizController());
        BizController controller;
        controller = (BizController) Proxy.newProxyInstance(BizController.class.getClassLoader(), new Class[]{BizController.class}, handler);
        controller.bizMethod();
    }
}
