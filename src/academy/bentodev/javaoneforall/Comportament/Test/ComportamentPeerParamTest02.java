package academy.bentodev.javaoneforall.Comportament.Test;

import academy.bentodev.javaoneforall.Comportament.Domain.Car;
import academy.bentodev.javaoneforall.Comportament.Interface.CarPredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * Aqui temos o " pulo do gato", nós implementamos uma interface "carPredicate" com um método test.
 * Esse método contratual retorna um boolean, então basicamente vamos sobrepor esse método para cumprir
 * o contrato de carPredicate com uma classe anonima, como visto na linha 22.
 * no return desse teste, podemos adicionar nossa regra de negocio e ela pode ser qualquer coisa, desde
 * que retorne um boolean, com isso, toas as vezes que invocamos o método filter, temos que passar
 * uma lista de carros e um carPredicate(fazemos isso adicionando uma classe anonima com uma lógica).
 * Dentro de filter, fazemos um for e um if para entender se o método contratual devolve true, caso devolva
 * nós adicionamos o car, em uma nova lista, deixando o método filter ainda mais generico.
 * Entretanto, podemos deixar isso ainda mais generico!
 * OBS.: A interface CarPredicate foi feita apenas para a simulação da ideia, no mundo real o correto seria usar
 * a interface "Predicate" que já vem com um método contratual "test" e com isso, podiamos fazer a mesma coisa
 * sem reinventar a roda.
 */
public class ComportamentPeerParamTest02 {
        private static List<Car> cars = List.of(
                new Car("green", 2011),
                new Car("black", 1998),
                new Car("red", 2019),
                new Car("red", 2016));

    public static void main(String[] args) {
        // mudando o filter para receber uma lambda como Predicate
        List<Car> filteredCars = filter(cars, car -> car.getColor().equals("green"));
        System.out.println(filteredCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();
        for(Car car: cars){
            if(carPredicate.test(car)) filteredCars.add(car);
        }
        return filteredCars;
    }
}
