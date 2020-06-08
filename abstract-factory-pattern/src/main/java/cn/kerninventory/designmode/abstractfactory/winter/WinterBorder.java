package cn.kerninventory.designmode.abstractfactory.winter;

import cn.kerninventory.designmode.abstractfactory.BorderSkin;

/**
 * @author Kern
 * @date 2020/6/8 11:30
 * @description
 */
public class WinterBorder implements BorderSkin {
    @Override
    public void coverBorder() {
        System.out.println("肃穆的冬天白色边框");
    }
}
