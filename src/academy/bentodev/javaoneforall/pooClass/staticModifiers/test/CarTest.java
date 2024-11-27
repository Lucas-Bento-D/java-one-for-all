package academy.bentodev.javaoneforall.pooClass.staticModifiers.test;

import academy.bentodev.javaoneforall.pooClass.staticModifiers.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car.setLimitVelocity(144);
        Car car01 = new Car("BMW", 280);
        Car car02 = new Car("Mercedes", 275);
        Car car03 = new Car("Audi", 290);
        car01.print();
        car02.print();
        car03.print();
    }
}
