package cn.kerninventory.designdemo.command.test;

import cn.kerninventory.designdemo.command.test.thirdparty.Huawei;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class HuaweiPhoneStarter implements PhoneStarter {

    private Huawei huawei = new Huawei();
    @Override
    public void open() {
        huawei.openHuaweiPhone();
    }
}
