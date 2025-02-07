package academy.bentodev.javaoneforall.generics.Service;

import academy.bentodev.javaoneforall.generics.Domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> availableVehicles;

    public RentalService(List<T> availablevehicles){
        this.availableVehicles = availablevehicles;
    }

    public T searchAvailableCar(){
        System.out.println("Buscando veiculo disponivel");
        T t = availableVehicles.remove(0);
        System.out.println("Alugando veiculo" + t);
        System.out.println("veiculos disponiveis para alugar:");
        System.out.println(availableVehicles);
        return t;
    }
    public void returnRentendCar(T t){
        System.out.println("Devolvendo veiculo: " + t);
        availableVehicles.add(t);
        System.out.println("veiculos disponiveis para alugar:");
        System.out.println(availableVehicles);
    }
}
