package cn.kerninventory.designdemo.command.test;

import cn.kerninventory.designdemo.command.test.thirdparty.SamSung;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class SamSungPhoneStarter implements PhoneStarter {

    private SamSung samSung = new SamSung();

    @Override
    public void open() {
        samSung.oepnSamSungPhone();
    }
}
