package academy.bentodev.javaoneforall.pooClass.polyformism.test;

import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Computer;
import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Tomato;
import academy.bentodev.javaoneforall.pooClass.polyformism.service.CalcTax;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("NCU10i7", 11000);
        Tomato tomato = new Tomato("Tomate cereja", 9.90);
        /**
         * Lembre-se agora com o uso do polimorfismo, o calc tax apesar de esperar o tipo "product" nos parametros, ele vai acessar
         * o product passado, ou seja, computer, tomator ou qualquer outra subclasse de Product e a partir  disso, o metodo vai acessar
         * metodos dentro dessas subclasses que foram passadas no parametro
         */
        CalcTax.calcTax(computer);
        CalcTax.calcTax(tomato);
    }
}
