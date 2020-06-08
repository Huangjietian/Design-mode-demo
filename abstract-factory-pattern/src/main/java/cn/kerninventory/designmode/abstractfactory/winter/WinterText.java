package cn.kerninventory.designmode.abstractfactory.winter;

import cn.kerninventory.designmode.abstractfactory.TextSkin;

/**
 * @author Kern
 * @date 2020/6/8 11:31
 * @description
 */
public class WinterText implements TextSkin {
    @Override
    public void coverText() {
        System.out.println("肃穆的冬天黑色字体");
    }
}
