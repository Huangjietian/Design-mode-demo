package cn.kerninventory.designmode.abstractfactory;

/**
 * @author Kern
 * @date 2020/6/8 11:23
 * @description
 */
public interface SkinFactory {

    BottonSkin botton();
    
    BorderSkin border();

    TextSkin text();

}
