package cn.kerninventory.designdemo.facade;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();

    public void invoke() {
        subSystemA.methodA();
        subSystemB.methodB();
    }
}
