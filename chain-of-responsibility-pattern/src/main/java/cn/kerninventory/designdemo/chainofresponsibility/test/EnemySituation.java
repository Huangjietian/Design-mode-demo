package cn.kerninventory.designdemo.chainofresponsibility.test;

import lombok.Data;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
@Data
public class EnemySituation {

    private int soldierNumber;

    public EnemySituation(int soldierNumber) {
        this.soldierNumber = soldierNumber;
    }

    public void print() {
        System.out.println("敌人人数： " + getSoldierNumber());
    }

}
