package cn.kerninventory.designdemo.builder.mydemo;

/**
 * @author Kern
 * @date 2020/6/8 18:43
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Car car = new BenzAutomobilePlant().carProduct(new SedanCarBuilder());
        System.out.println(car.toString());
    }
}
