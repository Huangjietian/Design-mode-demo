package cn.kerninventory.desginmode.state;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Context {

    private State state;

    public Context setState(State state) {
        this.state = state;
        return this;
    }

    public void request(){
        //其他代码
        state.handle(this);//调用状态对象的业务方法
        //其他代码
    }

    public void changeState(Object arg){
        //状态的改变
    }
}
