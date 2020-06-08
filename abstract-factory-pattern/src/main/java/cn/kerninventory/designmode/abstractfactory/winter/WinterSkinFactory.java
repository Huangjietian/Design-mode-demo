package cn.kerninventory.designmode.abstractfactory.winter;

import cn.kerninventory.designmode.abstractfactory.BorderSkin;
import cn.kerninventory.designmode.abstractfactory.BottonSkin;
import cn.kerninventory.designmode.abstractfactory.SkinFactory;
import cn.kerninventory.designmode.abstractfactory.TextSkin;

/**
 * @author Kern
 * @date 2020/6/8 11:29
 * @description
 */
public class WinterSkinFactory implements SkinFactory {
    @Override
    public BottonSkin botton() {
        return new WinterBotton();
    }

    @Override
    public BorderSkin border() {
        return new WinterBorder();
    }

    @Override
    public TextSkin text() {
        return new WinterText();
    }
}
