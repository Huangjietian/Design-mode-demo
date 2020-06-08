package cn.kerninventory.designdemo.builder.pcdemo;

/**
 * @author Kern
 * @date 2020/6/8 20:23
 * @description
 */
public class DesktopBuilder extends AbstractPcBuilder {

    @Override
    protected boolean needDisplay() {

        //需要显示器
        return true;
    }

    @Override
    protected int neededPowerSupplyTypeMode() {
        //需要电源线
        return 1;
    }

    @Override
    public void installCpu(String cpu) {
        pc.setCpu(cpu);
    }

    @Override
    public void installMemory(String memory) {
        pc.setMemory(memory);
    }

    @Override
    public void installHardDisk(String hardDisk) {
        pc.setHardDisk(hardDisk);
    }

    @Override
    public void installMainboard(Mainboard mainboard) {
        pc.setMainboard(mainboard);
    }

    @Override
    public void installDisplay(String display) {
        pc.setDisplay(display);
    }

    @Override
    public void installPowerSupplyType(int powerSupplyType) {
        pc.setPowerSupplyType(powerSupplyType);
    }
}
