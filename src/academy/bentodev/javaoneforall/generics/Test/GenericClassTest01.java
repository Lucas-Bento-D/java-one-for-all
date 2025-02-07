package academy.bentodev.javaoneforall.generics.Test;

import academy.bentodev.javaoneforall.generics.Domain.Car;
import academy.bentodev.javaoneforall.generics.Service.ProfitableCar;

public class GenericClassTest01 {
    public static void main(String[] args) {
        ProfitableCar profitableCar = new ProfitableCar();
        Car car = profitableCar.searchAvailableCar();
        System.out.println("Usando o carro por X meses");
        profitableCar.returnRentendCar(car);
    }
}
