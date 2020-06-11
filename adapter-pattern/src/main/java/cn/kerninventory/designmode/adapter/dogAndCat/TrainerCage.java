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
public class TrainerCage implements Cat, Dog {

    private Dog dog;

    private Cat cat;

    public TrainerCage(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    @Override
    public void catchMouse() {
        cat.catchMouse();
    }

    @Override
    public void learnDogWangwangwang() {
        dog.wangwangwang();
    }

    @Override
    public void wangwangwang() {
        dog.wangwangwang();
    }

    @Override
    public void learnCatCatchMouse() {
        cat.catchMouse();
    }
}
