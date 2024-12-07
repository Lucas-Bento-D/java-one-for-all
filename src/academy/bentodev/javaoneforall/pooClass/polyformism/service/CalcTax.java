package academy.bentodev.javaoneforall.pooClass.polyformism.service;

import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Computer;
import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Product;
import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Tomato;

public class CalcTax {
    /**
     * Com o uso do polimorfismo, nós conseguimos usar um mtodo deixando ele mais generico para todas as subclasses.
     * No caso de agora, simplesmente substituimos calcComputer e calcTomato que recebiam objetos as subclasses por um metodo
     * geral que calcula a taxa com a super classe, podendo ser usada para qualquer subclasse nova sem a necessidade de repetição de código
     * @param product
     */
    public static void calcTax(Product product){
        System.out.println("Relatorio de imposto");
        double tax = product.calcTax();
        System.out.println("Produto: " + product.getName());
        System.out.println("preço: " + product.getValue());
        System.out.println("Produto: " + tax);
    }

}
