package cn.kerninventory.designmode.abstractfactory.spring;

import cn.kerninventory.designmode.abstractfactory.TextSkin;

/**
 * @author Kern
 * @date 2020/6/8 11:28
 * @description
 */
public class SpringText implements TextSkin {
    @Override
    public void coverText() {
        System.out.println("充满了春天气息的粉色字体");
    }
}
