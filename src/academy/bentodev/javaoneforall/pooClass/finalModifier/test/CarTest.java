package academy.bentodev.javaoneforall.pooClass.finalModifier.test;

import academy.bentodev.javaoneforall.pooClass.finalModifier.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.getBUYER().setName("Junior");
        System.out.println(car.getBUYER().getName());
    }
}
