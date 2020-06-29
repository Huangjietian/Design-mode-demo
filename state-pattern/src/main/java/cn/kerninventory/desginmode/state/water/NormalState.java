package cn.kerninventory.desginmode.state.water;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class NormalState implements WaterState {

    @Override
    public String stateDesc() {
        return "============================液体";
    }

    public NormalState() {
        System.out.println(stateDesc());
    }

    @Override
    public void heatUp(Water water) {
        double current = water.getTemperature();
        double result = Double.sum(current, 10.0d);
        if (result > water.getBoilTemperature()) {
            water.setState(new BoilingState());
            result = Math.min(result, 100.0d);
        }
        water.setTemperature(result);
    }

    @Override
    public void refrigerate(Water water) {
        double current = water.getTemperature();
        double result = Double.sum(current, -10.0d);
        if (result <= 0.0d) {
            water.setState(new FrozenState());
        }
        water.setTemperature(result);
    }
}
