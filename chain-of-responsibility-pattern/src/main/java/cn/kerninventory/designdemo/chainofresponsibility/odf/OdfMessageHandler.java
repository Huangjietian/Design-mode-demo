package cn.kerninventory.designdemo.chainofresponsibility.odf;

import java.util.Comparator;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class OdfMessageHandler implements Comparator<OdfMessageHandler> {

    private int sort;

    public OdfMessageHandler(int sort) {
        this.sort = sort;
    }

    public int getSort() {
        return sort;
    }

    public OdfMessageHandler setSort(int sort) {
        this.sort = sort;
        return this;
    }

    protected OdfMessageHandler nextHandler;

    public void setNextHandler(OdfMessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract Object handleOdfMessage(OdfMessage odfMessage);

    @Override
    public int compare(OdfMessageHandler o1, OdfMessageHandler o2) {
        return Integer.compare(o1.getSort(), o2.getSort());

    }
}
