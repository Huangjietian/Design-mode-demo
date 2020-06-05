package cn.kerninventory.designmode.simplefactory.zh;

/**
 * @author Kern
 * @date 2020/6/5 15:14
 * @description
 */
public class 客户端 {

    public static void main(String[] args) {
        肉 肉肉 = 屠宰场.屠宰(new 牛());
        System.out.println(肉肉.getClass().getName());
    }
}
