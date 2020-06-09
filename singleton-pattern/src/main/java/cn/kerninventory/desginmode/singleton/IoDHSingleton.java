package cn.kerninventory.desginmode.singleton;

/**
 * @author Kern
 * @date 2020/6/9 16:09
 * @description
 */
public class IoDHSingleton {

    private IoDHSingleton() {
    }

    private static class InstanceHodler {
        private static final IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return InstanceHodler.instance;
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i ++) {
            new Thread(() -> {
                IoDHSingleton singleton = IoDHSingleton.getInstance();
                System.out.println(singleton.hashCode());
            }).start();
        }
    }
}
