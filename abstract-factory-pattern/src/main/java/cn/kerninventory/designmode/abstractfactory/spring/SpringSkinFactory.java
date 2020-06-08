package cn.kerninventory.designmode.abstractfactory.spring;

import cn.kerninventory.designmode.abstractfactory.BorderSkin;
import cn.kerninventory.designmode.abstractfactory.BottonSkin;
import cn.kerninventory.designmode.abstractfactory.SkinFactory;
import cn.kerninventory.designmode.abstractfactory.TextSkin;

/**
 * @author Kern
 * @date 2020/6/8 11:25
 * @description
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public BottonSkin botton() {
        return new SpringBotton();
    }

    @Override
    public BorderSkin border() {
        return new SpringBorder();
    }

    @Override
    public TextSkin text() {
        return new SpringText();
    }
}
