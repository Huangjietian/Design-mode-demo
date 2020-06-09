package cn.kerninventory.designmode.prototype;

/**
 * @author Kern
 * @date 2020/6/9 10:25
 * @description  通过实现cloneable接口实现深克隆。注意引用类型Quote也需要实现Cloneable接口并在Prototype中实现Quote的克隆调用
 */
public class CloneableClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototypeA = new Prototype("string", 1, 1.11d, new Quote(3));
        Prototype prototypeB = prototypeA.clone();
        prototypeB.setStr("alter");
        prototypeB.setDigit(2);
        prototypeB.setNumber(2.22d);
        prototypeB.getQuote().setNo(5);
        System.out.println(prototypeA.toString());
        System.out.println(prototypeB.toString());
    }
}
