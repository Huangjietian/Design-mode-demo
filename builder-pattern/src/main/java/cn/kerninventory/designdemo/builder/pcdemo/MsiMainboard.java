package cn.kerninventory.designdemo.builder.pcdemo;

/**
 * @author Kern
 * @date 2020/6/8 20:10
 * @description
 */
public class MsiMainboard implements Mainboard {
    @Override
    public boolean isSupported(String cpu) {
        return true;
    }
}
