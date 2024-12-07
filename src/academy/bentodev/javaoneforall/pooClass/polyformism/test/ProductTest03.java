package academy.bentodev.javaoneforall.pooClass.polyformism.test;

import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Computer;
import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Product;
import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Tomato;
import academy.bentodev.javaoneforall.pooClass.polyformism.service.CalcTax;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("tas", 12);

        Tomato tomato = new Tomato("americano", 24);
        tomato.setValidate("21/12/2024");
        CalcTax.calcTax(tomato);
    }
}
