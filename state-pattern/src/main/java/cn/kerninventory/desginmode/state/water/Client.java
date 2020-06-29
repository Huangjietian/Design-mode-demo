package cn.kerninventory.desginmode.state.water;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //高原地区水沸点较低
        Water water = new Water(80.0d);
        while (water.getTemperature() < 100.0d) {
            water.heatUp().printTemperature();
        }
        while (water.getTemperature() > 0.0d) {
            water.refrigerate().printTemperature();
        }
    }
}
