package cn.kerninventory.desginmode.templatemethod;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class AbstractTempalate {

    protected void method1(){
        System.out.println("方法1");
    }

    protected void method2(){
        System.out.println("方法2");
    }

    protected void method3(){
        System.out.println("方法3");
    }

    protected boolean hookMethod() {
        return true;
    }
    protected abstract void abstractMethod();

    public void templateMethod() {
        method1();
        if (hookMethod()) {
            method2();
        }
        abstractMethod();
        method3();
    }
}
