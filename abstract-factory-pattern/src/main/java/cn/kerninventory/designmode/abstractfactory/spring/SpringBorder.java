package cn.kerninventory.designmode.abstractfactory.spring;

import cn.kerninventory.designmode.abstractfactory.BorderSkin;

/**
 * @author Kern
 * @date 2020/6/8 11:27
 * @description
 */
public class SpringBorder implements BorderSkin {
    @Override
    public void coverBorder() {
        System.out.println("充满了春天气息的绿色边框");
    }
}
