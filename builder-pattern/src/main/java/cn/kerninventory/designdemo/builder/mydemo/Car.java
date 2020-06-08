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
public class Car {

    private String brand;

    private List<Wheel> wheels;

    private Chassis chassis;

    private CarBody carBody;

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Car setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
        return this;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Car setChassis(Chassis chassis) {
        this.chassis = chassis;
        return this;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public Car setCarBody(CarBody carBody) {
        this.carBody = carBody;
        return this;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheelsSize=" + wheels.size() +
                '}';
    }
}
