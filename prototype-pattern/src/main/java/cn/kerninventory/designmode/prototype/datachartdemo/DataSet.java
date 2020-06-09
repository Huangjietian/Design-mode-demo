package cn.kerninventory.designmode.prototype.datachartdemo;

import lombok.Data;

/**
 * @author Kern
 * @date 2020/6/9 10:44
 * @description
 */
public class DataSet implements Cloneable {

    private long serializeNo;

    public DataSet(long serializeNo) {
        this.serializeNo = serializeNo;
    }

    public long getSerializeNo() {
        return serializeNo;
    }

    public DataSet setSerializeNo(long serializeNo) {
        this.serializeNo = serializeNo;
        return this;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "serializeNo=" + serializeNo +
                "DataSet.hashCode()=" + this.hashCode() +
                '}';
    }

    @Override
    public DataSet clone() throws CloneNotSupportedException {
        return (DataSet) super.clone();
    }
}
