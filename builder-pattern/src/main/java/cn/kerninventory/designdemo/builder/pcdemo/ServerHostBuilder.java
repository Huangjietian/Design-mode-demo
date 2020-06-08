package cn.kerninventory.designdemo.builder.pcdemo;

/**
 * @author Kern
 * @date 2020/6/8 20:25
 * @description
 */
public class ServerHostBuilder extends DesktopBuilder {

    @Override
    protected boolean needDisplay() {
        //服务器主机不需要显示器
        return false;
    }

    @Override
    protected int neededPowerSupplyTypeMode() {
        //需要大功率的电源线
        return 0;
    }
}
