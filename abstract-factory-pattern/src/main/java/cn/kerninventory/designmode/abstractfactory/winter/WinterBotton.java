package cn.kerninventory.designmode.abstractfactory.winter;

import cn.kerninventory.designmode.abstractfactory.BottonSkin;

/**
 * @author Kern
 * @date 2020/6/8 11:30
 * @description
 */
public class WinterBotton implements BottonSkin {
    @Override
    public void coverBotton() {
        System.out.println("肃穆的冬天白色按钮");
    }
}
