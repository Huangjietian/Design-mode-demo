package cn.kerninventory.designdemo.builder.pcdemo;

/**
 * @author Kern
 * @date 2020/6/8 20:03
 * @description
 */
public class Pc {

    private String cpu;

    private String memory;

    private String hardDisk;

    private Mainboard mainboard;

    private String display;

    private int  powerSupplyType;

    public String getCpu() {
        return cpu;
    }

    public Pc setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getMemory() {
        return memory;
    }

    public Pc setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public Pc setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public Pc setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public Pc setDisplay(String display) {
        this.display = display;
        return this;
    }

    public int getPowerSupplyType() {
        return powerSupplyType;
    }

    public Pc setPowerSupplyType(int powerSupplyType) {
        this.powerSupplyType = powerSupplyType;
        return this;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", mainboard=" + mainboard +
                ", display='" + display + '\'' +
                ", powerSupplyType=" + powerSupplyType +
                '}';
    }
}
