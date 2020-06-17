package cn.kerninventory.designdemo.facade.exercise;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public interface Mainframe {

    void on();

    static Mainframe getInstance() {
        //可配置实现
        return new LenovoMainframe();
    }
}
