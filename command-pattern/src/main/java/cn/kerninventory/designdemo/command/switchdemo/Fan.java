package cn.kerninventory.designdemo.command.switchdemo;

import lombok.SneakyThrows;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Fan implements Runnable {

    public volatile boolean open;

    @SneakyThrows
    @Override
    public void run() {
        while (open) {
            System.out.println("风扇转");
            Thread.sleep(1000L);
        }
    }
}
