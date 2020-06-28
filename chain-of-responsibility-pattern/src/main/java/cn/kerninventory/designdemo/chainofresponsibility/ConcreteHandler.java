package cn.kerninventory.designdemo.chainofresponsibility;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConcreteHandler extends Handler {

    public ConcreteHandler(Handler successor) {
        super(successor);
    }

    private boolean processible(String request) {
        return request != null;
    }

    @Override
    public void handleResquest(String request) {
        if (processible(request)){
            //SOMETHING TO DO!
            System.out.println(this.getClass().getName() + " to Handle this request :" + request);
        }
        else {
            this.successor.handleResquest(request);
        }
    }
}
