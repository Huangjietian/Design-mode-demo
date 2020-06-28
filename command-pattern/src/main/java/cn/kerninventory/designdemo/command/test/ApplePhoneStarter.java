package cn.kerninventory.designdemo.command.test;

import cn.kerninventory.designdemo.command.test.thirdparty.Apple;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ApplePhoneStarter implements PhoneStarter {

    private Apple apple = new Apple();

    @Override
    public void open() {
        apple.openApplePhone();
    }
}
