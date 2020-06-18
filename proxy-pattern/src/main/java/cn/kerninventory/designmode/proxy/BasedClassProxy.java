package cn.kerninventory.designmode.proxy;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class BasedClassProxy extends SubjectImpl {

    public void before(){
        System.out.println("业务前织入");
    }

    public void after(){
        System.out.println("业务后织入");
    }

    @Override
    public void method() {
        before();
        super.method();
        after();
    }
}
