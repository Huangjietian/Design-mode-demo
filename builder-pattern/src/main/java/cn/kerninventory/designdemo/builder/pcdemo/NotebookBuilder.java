package cn.kerninventory.designdemo.builder.pcdemo;

/**
 * @author Kern
 * @date 2020/6/8 20:19
 * @description
 */
public class NotebookBuilder extends AbstractPcBuilder {

    @Override
    protected boolean needDisplay() {

        //自带显示器
        return false;
    }

    @Override
    protected int neededPowerSupplyTypeMode() {

        //需要低压电源
        return 3;
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
