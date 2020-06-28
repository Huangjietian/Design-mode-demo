package cn.kerninventory.designdemo.command.test;

import cn.kerninventory.designdemo.command.test.thirdparty.Apple;
import cn.kerninventory.designdemo.command.test.thirdparty.Huawei;
import cn.kerninventory.designdemo.command.test.thirdparty.SamSung;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Huawei huawei;
        Apple apple;
        SamSung samSung;
        /**
         * 三款不同的手机
         * 不同的手机的内核开机时需要执行的实际操作可能是不同的，甚至对外提供的api接口名称也是不同的。
         * 当我们的手机加工厂希望按钮按下时无论安装什么手机内核都能够启动，可以通过命令模式对不同的手机进行封装。
         */
        Buttom buttom = getSystemOpenButtom();
        buttom.click();
    }

    public static Buttom getSystemOpenButtom(){
        /**
         * 判断属于哪一款手机
         */
        PhoneStarter phoneStarter = new HuaweiPhoneStarter();
        return new Buttom(phoneStarter);
    }
}
