package cn.kerninventory.designmode.abstractfactory.spring;

import cn.kerninventory.designmode.abstractfactory.BottonSkin;

/**
 * @author Kern
 * @date 2020/6/8 11:25
 * @description
 */
public class SpringBotton implements BottonSkin {
    @Override
    public void coverBotton() {
        System.out.println("充满春天气息的绿色按钮");
    }
}
