package academy.bentodev.javaoneforall.generics.Service;

import academy.bentodev.javaoneforall.generics.Domain.Boat;
import academy.bentodev.javaoneforall.generics.Domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ProfitableBoat {
    private List<Boat> availableBoats = new ArrayList<>(
            List.of(
                    new Boat("lancha"),
                    new Boat("Canoa")
            )
    );

    public Boat searchAvailableBoat(){
        System.out.println("Buscando Barco disponivel");
        Boat boat = availableBoats.remove(0);
        System.out.println("Alugando Barco");
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(availableBoats);
        return boat;
    }
    public void returnRentendBoat(Boat boat){
        System.out.println("Devolvendo Barco: " + boat);
        availableBoats.add(boat);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(availableBoats);
    }
}
