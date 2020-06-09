package cn.kerninventory.desginmode.singleton;

/**
 * @author Kern
 * @date 2020/6/9 15:42
 * @description 饿汉式单例， 单例对象立即加载
 */
public class EagelSingleton {

    private static EagelSingleton instance = new EagelSingleton();

    private EagelSingleton() {
    }

    public static EagelSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i ++) {
            new Thread(() -> {
                EagelSingleton singleton = EagelSingleton.getInstance();
                System.out.println(singleton.hashCode());
            }).start();
        }
    }
}
