package cn.kerninventory.designdemo.command.switchdemo;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        Switch lightSwitch = new Switch(new LightCommand());
        Switch fanSwitch = new Switch(new FanCommand());
        lightSwitch.switched("回家开灯");


        Thread.sleep(5000L);


        lightSwitch.switched("睡觉关灯");
        fanSwitch.switched("睡觉开风扇");


        Thread.sleep(5000L);
        fanSwitch.switched("早上起来关风扇");

    }
}
