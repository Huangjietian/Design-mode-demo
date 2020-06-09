package cn.kerninventory.designmode.prototype;

import java.io.Serializable;

/**
 * @author Kern
 * @date 2020/6/9 10:28
 * @description
 */
public class Quote implements Cloneable, Serializable {

    private int no;

    public Quote(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public Quote setNo(int no) {
        this.no = no;
        return this;
    }

    @Override
    public Quote clone() throws CloneNotSupportedException {
        return (Quote) super.clone();
    }
}
