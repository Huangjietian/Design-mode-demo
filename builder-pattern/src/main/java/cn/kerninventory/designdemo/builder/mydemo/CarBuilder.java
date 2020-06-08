package cn.kerninventory.designdemo.builder.mydemo;

import cn.kerninventory.designdemo.builder.mydemo.component.CarBody;
import cn.kerninventory.designdemo.builder.mydemo.component.Chassis;
import cn.kerninventory.designdemo.builder.mydemo.component.Wheel;

import java.util.List;

/**
 * @author Kern
 * @date 2020/6/8 18:11
 * @description
 */
public abstract class CarBuilder {

    protected Car car = new Car();

    protected int wheelsSize () {
        return 4;
    }

    public abstract void installBrand(String brand);

    public abstract void installWheel(List<Wheel> wheels);

    public abstract void installChassis(Chassis chassis);

    public abstract void installCarBody(CarBody carBody);

    public Car finish() {
        return this.car;
    }
}
