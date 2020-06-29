package cn.kerninventory.desginmode.state.water;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class Water {

    private double temperature;

    private WaterState state;

    private double boilTemperature;

    private String chemicalExpression = "H2O";

    public Water(double boilTemperature) {
        this.boilTemperature = boilTemperature;
        this.state = new NormalState();
        this.temperature = 37.6d;
    }

    public double getBoilTemperature() {
        return boilTemperature;
    }

    public Water setState(WaterState state) {
        this.state = state;
        return this;
    }

    public double getTemperature() {
        return temperature;
    }

    public Water setTemperature(double temperature) {
        this.temperature = temperature;
        return this;
    }

    public Water heatUp() {
        System.out.println("加热10℃");
        state.heatUp(this);
        return this;
    }

    public Water refrigerate() {
        System.out.println("冷却10℃");
        state.refrigerate(this);
        return this;
    }

    public Water printTemperature(){
        System.out.println("当前温度： " + getTemperature());
        return this;
    }

}
