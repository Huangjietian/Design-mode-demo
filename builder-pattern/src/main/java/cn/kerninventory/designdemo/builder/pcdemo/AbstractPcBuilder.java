package cn.kerninventory.designdemo.builder.pcdemo;

/**
 * @author Kern
 * @date 2020/6/8 20:05
 * @description
 */
public abstract class AbstractPcBuilder {

    protected Pc pc = new Pc();

    protected abstract boolean needDisplay();

    protected abstract int neededPowerSupplyTypeMode();

    public abstract void installCpu(String cpu);

    public abstract void installMemory(String memory);

    public abstract void installHardDisk(String hardDisk);

    public abstract void installMainboard(Mainboard mainboard);

    public abstract void installDisplay(String display);

    public abstract void installPowerSupplyType(int powerSupplyType);

    protected Pc getPc() {
        return pc;
    }

    public Pc packagePc(String cpu, String memory, String hardDisk, Mainboard mainboard, String display, int powerSupplyType) {
        if (!mainboard.isSupported(cpu)) {
            throw new IllegalArgumentException("The motherboard does not support CPU");
        }
        this.installMainboard(mainboard);
        this.installCpu(cpu);
        this.installMemory(memory);
        this.installHardDisk(hardDisk);
        if (this.needDisplay()) {
            this.installDisplay(display);
        }
        if (neededPowerSupplyTypeMode() == powerSupplyType) {
            this.installPowerSupplyType(powerSupplyType);
        } else {
            throw new IllegalArgumentException("Wrong power supply");
        }
        return this.getPc();
    }
}
