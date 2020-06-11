package cn.kerninventory.designmode.adapter;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * <h1>中文注释</h1>
 * <p>
 *     缺省适配器模式示例
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class DefaultAdapterPatternExample {}

/**
 * 直接实现将需要实现接口的全部方法,有些时候可能不需要这么多的方法
 */
class WindowA implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

/**
 * 实现抽象类(缺省适配器)可以选择性的override你需要实现的接口
 */
class WindowB extends WindowAdapter {

}
