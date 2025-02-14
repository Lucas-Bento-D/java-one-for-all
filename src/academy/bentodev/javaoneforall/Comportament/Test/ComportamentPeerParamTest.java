package academy.bentodev.javaoneforall.Comportament.Test;

import academy.bentodev.javaoneforall.Comportament.Domain.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Basicamente esse é um exemplo de como fazer funções escalaveis por parametros, até então nada diferente
 * de qualquer outra linguagem de programação
 */
public class ComportamentPeerParamTest {

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("green", 2011),
                new Car("black", 1998),
                new Car("red", 2019),
                new Car("red", 2016));

        List<Car> colorCars = getCarsPeerColor(cars, "red");

        List<Car> yearCars = getCarsEqualOrMoreYear(cars, 2010);

        for(Car car: colorCars){
            System.out.println(car.toString());
        }
        System.out.println("-------------------------");
        for(Car car: yearCars){
            System.out.println(car.toString());
        }
    }

    private static List<Car> getCarsPeerColor(List<Car> cars, String color){
        List<Car> colorCars = new ArrayList<>();
        for(Car car: cars){
            if(car.getColor().equals(color)) colorCars.add(car);
        }
        return colorCars;
    }

    private static List<Car> getCarsEqualOrMoreYear(List<Car> cars, int year){
        List<Car> yearCars = new ArrayList<>();
        for(Car car: cars){
            if(car.getYear() >= year) yearCars.add(car);
        }
        return yearCars;
    }
}
