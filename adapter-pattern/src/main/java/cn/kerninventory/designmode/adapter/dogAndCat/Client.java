package cn.kerninventory.designmode.adapter.dogAndCat;

/**
 * <h1>中文注释</h1>
 * <p>
 * 一句话描述
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Cat cat = new TrainerCage(new Dog() {
            @Override
            public void wangwangwang() {
                System.out.println("狗叫");
            }
        }, new Cat() {
            @Override
            public void catchMouse() {
                System.out.println("抓老鼠");
            }
        });

        cat.catchMouse();
        cat.learnDogWangwangwang();

        Dog dog = new TrainerCage(new Dog() {
            @Override
            public void wangwangwang() {
                System.out.println("狗叫");
            }
        }, new Cat() {
            @Override
            public void catchMouse() {
                System.out.println("抓老鼠");
            }
        });

        dog.wangwangwang();
        dog.learnCatCatchMouse();
    }
}
