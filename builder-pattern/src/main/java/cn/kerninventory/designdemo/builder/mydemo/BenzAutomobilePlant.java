package cn.kerninventory.designdemo.builder.mydemo;

import cn.kerninventory.designdemo.builder.mydemo.component.CarBody;
import cn.kerninventory.designdemo.builder.mydemo.component.Chassis;
import cn.kerninventory.designdemo.builder.mydemo.component.Wheel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kern
 * @date 2020/6/8 18:35
 * @description
 */
public class BenzAutomobilePlant {

    private static String brand = "Benz";

    public Car carProduct(CarBuilder builder) {
        List<Wheel> wheels = new ArrayList<>();
        for (int i = 0 ; i < 4 ; i ++) {
            wheels.add(new Wheel.BenzWheel());
        }
        Chassis chassis = new Chassis.BenzChassis();
        CarBody carBody = new CarBody.BenzCarBody();
        builder.installChassis(chassis);
        builder.installWheel(wheels);
        builder.installCarBody(carBody);
        builder.installBrand(brand);
        return builder.finish();
    }
}
