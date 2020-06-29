package cn.kerninventory.desginmode.state.water;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public interface WaterState {

    String stateDesc();

    void heatUp(Water water);

    void refrigerate(Water water);
}
