package cn.kerninventory.desginmode.singleton;

/**
 * @author Kern
 * @date 2020/6/9 15:57
 * @description
 */
public class LazySingleton {

    private volatile static LazySingleton instance;

    private LazySingleton() {
    }

    /**
     * 双重检查锁定机制配合同步锁保证了懒汉式单例类实例的初始化操作有且仅有一次
     * @return
     */
    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //同步锁
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i ++) {
            new Thread(() -> {
                LazySingleton singleton = LazySingleton.getInstance();
                System.out.println(singleton.hashCode());
            }).start();
        }
    }
}
