package academy.bentodev.javaoneforall.generics.Test;

import academy.bentodev.javaoneforall.generics.Domain.Boat;
import academy.bentodev.javaoneforall.generics.Domain.Car;
import academy.bentodev.javaoneforall.generics.Service.ProfitableBoat;
import academy.bentodev.javaoneforall.generics.Service.RentalService;

import java.util.ArrayList;
import java.util.List;

/**
 * Agora trazendo a resolução do problema, mudamos o pensamento para utilizar uma classe de serviço geral(rentalService)
 * A diferença dessa classe para as outras é que rentalService não espera nem Car e nem Boat para seus métodos, ela espera T
 * T é uma classe generica, ou seja, pode ser qualquer coisa, então adicionando o T para classe generica, nós podemos enviar
 * tanto Car, quanto Boat. Claro, fizemos algumas mudanças na classe para podermos construir passando essa lista e a classe trabalhar
 * de forma mais coerente, mas agora temos um código que atende duas( ou mais) classes.
 */
public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(
                List.of(
                        new Car("BMW"),
                        new Car("Mercedes")
                )
        );
        List<Boat> availableBoats = new ArrayList<>(
                List.of(
                        new Boat("lancha"),
                        new Boat("Canoa")
                )
        );
        RentalService<Car> carRentalService = new RentalService<>(availableCars);
        RentalService<Boat> boatRentalService = new RentalService<>(availableBoats);

        Car car = carRentalService.searchAvailableCar();
        System.out.println("Usando Carro por X meses");
        carRentalService.returnRentendCar(car);
    }
}
