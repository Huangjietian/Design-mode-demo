package cn.kerninventory.designdemo.builder.pcdemo;

import sun.security.krb5.internal.crypto.Des;

/**
 * @author Kern
 * @date 2020/6/8 20:26
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Pc notebook;
        notebook = new NotebookBuilder().packagePc("笔记本cpu", "8G笔记本内存", "固态", new MsiMainboard(), null, 3);
        System.out.println(notebook.toString());

        Pc desktop;
        desktop = new DesktopBuilder().packagePc("主机Cpu", "8G内存", "固态", new AsusMainboard(), "显示器", 1);
        System.out.println(desktop.toString());

        Pc serverHost;
        serverHost = new ServerHostBuilder().packagePc("服务器CPU", "16G内存", "固态+热备", new AsusMainboard(), null, 0);
        System.out.println(serverHost.toString());
    }
}
