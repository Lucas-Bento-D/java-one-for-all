package academy.bentodev.javaoneforall.generics.Service;

import academy.bentodev.javaoneforall.generics.Domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ProfitableCar {
    private List<Car> availableCars = new ArrayList<>(
            List.of(
                    new Car("BMW"),
                    new Car("Mercedes")
            )
    );

    public Car searchAvailableCar(){
        System.out.println("Buscando carro disponivel");
        Car car = availableCars.remove(0);
        System.out.println("Alugando carro");
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(availableCars);
        return car;
    }
    public void returnRentendCar(Car car){
        System.out.println("Devolvendo carro: " + car);
        availableCars.add(car);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(availableCars);
    }
}
