package cn.kerninventory.designdemo.chainofresponsibility.test;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class EnemySituationHandler {

    protected EnemySituationHandler superior;

    public EnemySituationHandler(EnemySituationHandler superior) {
        this.superior = superior;
    }

    public abstract int processibleNumber();

    public abstract void handle(EnemySituation enemySituation);

    public void receive(EnemySituation enemySituation) {
        if (processibleNumber() >= enemySituation.getSoldierNumber()) {
            this.handle(enemySituation);
        } else {
            if (superior != null)
                superior.receive(enemySituation);
        }
    }
}
