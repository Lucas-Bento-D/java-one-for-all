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

        /**
         * Por meio de "casting", conseguimos acessar metodos da subclasse, mesmo com a tipagem sendo a superclasse.
         * Nesse caso, em "ProductTest03", nós passamos a instancia "Tomato" para o metodo calcTax, mas dentro do metodo,
         * nós usamos o parametro product sendo referenciado por Product, então incialmente não tinhamos como pegar a validade de Tomato,
         * visto que Product não tem o metodo getValidate, e é aí que o casting entra em ação.
         * Na linha 30, nos fazemos o casting para dizer que product tem que ser tratado como Tomato, podendo assim acessar o metodo getValidade
         * Visto que o metodo calcTax é usado pra qualquer subclasse de product, teriamos assim um erro de compilação quando fossemos inserir
         * outras instancias como parametro de calcTax(nesse caso computer), pois não existiria getValidade nelas, para resolver isso usamos o instanceof
         * que basicamente verifica se a instancia usada é Tomato e se for executa o casting.
         *
         * Vale lembrar que apesar dessa ser uma forma de polimorfismo de filho pra pai, o uso do casting é uma má pratica.
         */
        if(product instanceof Tomato){
            Tomato tomato = (Tomato) product;
            System.out.println(tomato.getValidate());
        }
    }

}
