package cn.kerninventory.designmode.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class BizLogInvocationHandler implements InvocationHandler {

    private Object object;

    public BizLogInvocationHandler(Object object) {
        this.object = object;
    }

    private void log(){
        System.out.println("记录日志");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log();
        Object result = method.invoke(object, args);
        return result;
    }
}
