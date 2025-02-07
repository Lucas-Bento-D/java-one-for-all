package academy.bentodev.javaoneforall.generics.Test;

import academy.bentodev.javaoneforall.generics.Domain.Boat;
import academy.bentodev.javaoneforall.generics.Domain.Car;
import academy.bentodev.javaoneforall.generics.Service.ProfitableBoat;
import academy.bentodev.javaoneforall.generics.Service.ProfitableCar;

/**
 * Aqui temos o serviço para barcos usando a classe ProfitableBoat
 * A grande questão agora é que isso tudo funciona, mas no momento nós temos duas classes de serviço que são identicas
 * Mudando a classe utilizada apenas de Car para Boat. Não estamos discutindo funcionamento e sim prática, pois
 * isso funciona, mas temos o mesmo código para duas coisas e isso não é bom.
 */
public class GenericClassTest02 {
    public static void main(String[] args) {
        ProfitableBoat profitableBoat = new ProfitableBoat();
        Boat Boat = profitableBoat.searchAvailableBoat();
        System.out.println("Usando o Barco por X meses");
        profitableBoat.returnRentendBoat(Boat);
    }
}
