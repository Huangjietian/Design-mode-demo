package cn.kerninventory.designdemo.builder.mydemo;

import cn.kerninventory.designdemo.builder.mydemo.component.CarBody;
import cn.kerninventory.designdemo.builder.mydemo.component.Chassis;
import cn.kerninventory.designdemo.builder.mydemo.component.Wheel;
import javafx.util.Builder;

import java.util.List;

/**
 * @author Kern
 * @date 2020/6/8 18:30
 * @description
 */
public class SedanCarBuilder extends CarBuilder {

    @Override
    protected int wheelsSize() {
        return super.wheelsSize();
    }

    @Override
    public void installBrand(String brand) {
        //无数细节省略
        this.car.setBrand(brand);
    }

    @Override
    public void installWheel(List<Wheel> wheels) {
        if (wheels == null || wheels.size() != wheelsSize()) {
            throw new IllegalArgumentException("安装轮胎失败");
        }
        //无数细节省略
        this.car.setWheels(wheels);
    }

    @Override
    public void installChassis(Chassis chassis) {
        //无数细节省略
        this.car.setChassis(chassis);
    }

    @Override
    public void installCarBody(CarBody carBody) {
        //无数细节省略
        this.car.setCarBody(carBody);
    }
}
