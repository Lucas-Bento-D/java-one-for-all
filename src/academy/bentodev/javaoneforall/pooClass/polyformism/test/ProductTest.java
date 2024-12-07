package academy.bentodev.javaoneforall.pooClass.polyformism.test;

import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Computer;
import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Tomato;
import academy.bentodev.javaoneforall.pooClass.polyformism.service.CalcTax;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("NCU10i7", 11000);
        Tomato tomato = new Tomato("Tomate cereja", 9.90);
        CalcTax.calcComputerTax(computer);
        CalcTax.calcTomatoTax(tomato);
    }
}
