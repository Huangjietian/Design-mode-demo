package cn.kerninventory.desginmode.singleton.window;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Kern
 * @date 2020/6/9 16:43
 * @description
 */
public class Client extends JFrame {

    private JButton button;
    private JDesktopPane desktopPane;
    private SubFrame subFrame = null;

    public Client() throws HeadlessException {
        super("主窗口");
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());

        button = new JButton("点击创建一个内部窗口");
        button.addActionListener(new MyButtonListener());
        c.add(button, BorderLayout.SOUTH);

        desktopPane = new JDesktopPane();
        c.add(desktopPane);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400,400);
        this.show();
    }

    class MyButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (subFrame != null) {
                desktopPane.remove(subFrame);
            }
            subFrame = SubFrame.getInstance();
            desktopPane.add(subFrame);
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
