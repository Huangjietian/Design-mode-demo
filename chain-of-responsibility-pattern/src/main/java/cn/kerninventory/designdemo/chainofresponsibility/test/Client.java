package cn.kerninventory.designdemo.chainofresponsibility.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        EnemySituationHandler lvzhang = new LvZhang(null);
        EnemySituationHandler yingzhang = new YingZhang(lvzhang);
        EnemySituationHandler paizhang = new PaiZhang(yingzhang);
        EnemySituationHandler banzhang = new BanZhang(paizhang);

        EnemySituation enemySituation = new EnemySituation(201);
        banzhang.receive(enemySituation);
    }
}
