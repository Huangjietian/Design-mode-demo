package cn.kerninventory.designdemo.builder.pcdemo;

/**
 * @author Kern
 * @date 2020/6/8 20:09
 * @description
 */
public class AsusMainboard implements Mainboard {
    @Override
    public boolean isSupported(String cpu) {
        if (cpu == null || cpu.trim().equals("")){
            return false;
        }
        return true;
    }
}
