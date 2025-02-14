package academy.bentodev.javaoneforall.Comportament.Test;

import academy.bentodev.javaoneforall.Comportament.Domain.Car;
import academy.bentodev.javaoneforall.Comportament.Interface.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Seguindo a ideia de deixar o método ainda mais generico, adicionamos tipos genericos ao método e a interface
 * Predicate. Com isso na chamada do método, seguimos a mesma lógica, passando uma lista(agora de qualquer coisa)
 * e uma instancia do Predicate passando o tipo real que vamos lidar, nisso abrimos a classe anonima e por meio
 * de polimorfismo, adicionamos nossa lógica ao método test que vai ser usado dentro do método filter
 */
public class ComportamentPeerParamTest03 {
        private static List<Car> cars = List.of(
                new Car("green", 2011),
                new Car("black", 1998),
                new Car("red", 2019),
                new Car("red", 2016));

    public static void main(String[] args) {
        List<Car> filteredCars = filter(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(filteredCars);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T item: list){
            if(predicate.test(item)) filteredList.add(item);
        }
        return filteredList;
    }
}
