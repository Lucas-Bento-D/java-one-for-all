package academy.bentodev.javaoneforall.pooClass.constructors.test;

import academy.bentodev.javaoneforall.pooClass.constructors.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("corolla", "Toyota", "Prata");
        car.print();
    }
}
