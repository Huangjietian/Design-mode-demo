package cn.kerninventory.desginmode.singleton.window;

import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 * @author Kern
 * @date 2020/6/9 16:39
 * @description
 */
public class SubFrame extends JInternalFrame {

    private static SubFrame instance;
    private SubFrame() {
        super("子窗口", true, true, true, false);
        this.setLocation(20,20);
        this.setSize(200,200);
        this.addInternalFrameListener(new MyIFListerner());
        this.setVisible(true);
    }

    public static SubFrame getInstance() {
        if (instance == null) {
            synchronized (SubFrame.class) {
                if (instance == null) {
                    instance = new SubFrame();
                }
            }
        }
        return instance;
    }

    //窗口关闭 设置为空， 下次点击时重新生成一个新的窗口
    class MyIFListerner extends InternalFrameAdapter {
        @Override
        public void internalFrameClosed(InternalFrameEvent e) {
            if (instance != null) {
                instance = null;
            }
        }
    }
}
