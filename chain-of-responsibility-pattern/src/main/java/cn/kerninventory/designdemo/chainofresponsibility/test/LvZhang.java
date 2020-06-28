package cn.kerninventory.designdemo.chainofresponsibility.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class LvZhang extends EnemySituationHandler {

    public LvZhang(EnemySituationHandler superior) {
        super(superior);
    }

    @Override
    public int processibleNumber() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(EnemySituation enemySituation) {
        enemySituation.print();
        System.out.println("敌人数量过多，开会讨论作战计划");
        System.out.println("会议结束，下达作战命令");
    }
}
