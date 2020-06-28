package cn.kerninventory.designdemo.chainofresponsibility.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class BanZhang extends EnemySituationHandler {

    public BanZhang(EnemySituationHandler superior) {
        super(superior);
    }

    @Override
    public int processibleNumber() {
        return 10;
    }

    @Override
    public void handle(EnemySituation enemySituation) {
        enemySituation.print();
        System.out.println("班长下达作战命令");
    }
}
