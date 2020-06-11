package cn.kerninventory.designmode.bridge;

import cn.kerninventory.designmode.bridge.pen.Bule;
import cn.kerninventory.designmode.bridge.pen.LargeSizePen;
import cn.kerninventory.designmode.bridge.pen.Pen;

/**
 * <h1>中文注释</h1>
 * <p>
 * 一句话描述
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Pen pen = new LargeSizePen();
        String str = pen.draw();
        if (str == null) {
            //适配过程
            pen.setColor(new Bule());
            pen.draw();
        }

    }
}
