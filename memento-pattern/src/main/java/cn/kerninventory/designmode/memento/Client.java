package cn.kerninventory.designmode.memento;

import cn.kerninventory.designmode.memento.caretaker.Caretaker;
import cn.kerninventory.designmode.memento.memento.Originator;
import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Originator ori = new Originator("状态1");
        System.out.println(ori.getState());

        Caretaker ct = new Caretaker();
        ct.setMemento(ori.createMemento());

        ori.setState("状态2");
        System.out.println(ori.getState());

        ori.restoreMemento(ct.getMemento());
        System.out.println(ori.getState());
    }
}
