package cn.kerninventory.designdemo.facade.exercise;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class LenovoMainframe implements Mainframe {

    private Runnable memory;

    private Runnable cpu;

    private Runnable hardDisk;

    private Runnable operateSystem;

    public LenovoMainframe() {
        memory = () -> System.out.println("内存自检");
        cpu = () -> System.out.println("cpu运行");
        hardDisk = () -> System.out.println("硬盘读取数据");
        operateSystem = () -> System.out.println("操作系统载入");
    }

    @Override
    public void on() {
        memory.run();
        cpu.run();
        hardDisk.run();
        operateSystem.run();
        System.out.println("联想电脑启动");
    }
}
