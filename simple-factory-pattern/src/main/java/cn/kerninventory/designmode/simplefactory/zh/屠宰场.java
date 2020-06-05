package cn.kerninventory.designmode.simplefactory.zh;

import javax.swing.*;

/**
 * @author Kern
 * @date 2020/6/5 15:08
 * @description
 */
public class 屠宰场 {

    public static 肉 屠宰(家畜 参数) {
        if (参数 instanceof 牛) {
            return new 牛肉();
        } else if (参数 instanceof 羊) {
            return new 羊肉();
        } else {
            return null;
        }
    }
}
