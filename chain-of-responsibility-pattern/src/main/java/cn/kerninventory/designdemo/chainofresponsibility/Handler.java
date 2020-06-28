package cn.kerninventory.designdemo.chainofresponsibility;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class Handler {

    /**
     * 继任者
     */
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleResquest(String request);
}
