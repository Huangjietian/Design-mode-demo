package cn.kerninventory.desginmode.state.water;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class FrozenState implements WaterState {
    @Override
    public String stateDesc() {
        return "============================冻结了";
    }

    public FrozenState() {
        System.out.println(stateDesc());
    }

    @Override
    public void heatUp(Water water) {
        double current = water.getTemperature();
        double result = Double.sum(current, 10.0d);
        if (result > 0.0d) {
            water.setState(new NormalState());
        }
        water.setTemperature(result);
    }

    @Override
    public void refrigerate(Water water) {
        double current = water.getTemperature();
        double result = Double.sum(current, -10.0d);
        water.setTemperature(result);
    }
}
