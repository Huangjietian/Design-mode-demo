package cn.kerninventory.designmode.memento.test;

import cn.kerninventory.designmode.memento.test.tablet.Tablet;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        //打字并保存
        tablet.write("日志\r\n");

        //打字不保存,并撤销
        tablet.write("2020-06-28");
        tablet.undo();

        //打字保存
        tablet.write("2020-06-29");
        //打字不保存,并撤销
        tablet.write("天气晴朗");
        tablet.write("今天...");
        tablet.undo();
        tablet.undo();
        //打字
        tablet.write("天气阴");

        tablet.reset();
    }
}
