package cn.kerninventory.designmode.abstractfactory;

import cn.kerninventory.designmode.abstractfactory.spring.SpringSkinFactory;
import cn.kerninventory.designmode.abstractfactory.winter.WinterSkinFactory;

/**
 * @author Kern
 * @date 2020/6/8 11:32
 * @description
 */
public class Client {

    public enum SkinEnum {
        SPRING,
        WINTER,
        ;
    }

    public static void chooseSkin(SkinEnum skinEnum) {
        SkinFactory skinFactory;
        switch (skinEnum) {
            case SPRING:
                skinFactory = new SpringSkinFactory();
                break;
            case WINTER:
                skinFactory = new WinterSkinFactory();
                break;
            default:
                skinFactory = new SpringSkinFactory();
        }
        skinFactory.border().coverBorder();
        skinFactory.botton().coverBotton();
        skinFactory.text().coverText();
    }


    public static void main(String[] args) {
        Client.chooseSkin(SkinEnum.WINTER);
    }

}
