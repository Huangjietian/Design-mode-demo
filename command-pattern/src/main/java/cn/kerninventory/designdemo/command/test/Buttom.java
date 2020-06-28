package cn.kerninventory.designdemo.command.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Buttom {

    private PhoneStarter phoneStarter;

    public Buttom(PhoneStarter phoneStarter) {
        this.phoneStarter = phoneStarter;
    }

    public void click(){
        phoneStarter.open();
    }
}
