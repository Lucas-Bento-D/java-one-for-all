package academy.bentodev.javaoneforall.pooClass.polyformism.test;

import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Computer;
import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Product;
import academy.bentodev.javaoneforall.pooClass.polyformism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        /**
         * Aqui temos uma classe mais geral(Product) fazendo referencia a uma classe especifica filha(computer e tomato),
         *  isso funciona, pois tudo que produto tem, Computer ou Tomato terá também.
         *  Apesar da referencia ser feita e funcionar, quando executamos um método de "product" por exemplo, que está executando é a classe instanciada
         *  "computer", com isso, conseguimos utilizar de metodos que vem de product, mas executada por computer, sendo um exemplo de herança.
         */
        Product product = new Computer("tas", 12);
        System.out.println(product.getName());
        System.out.println(product.calcTax());

        /**
         * Vale lembrar que não conseguimos acessar metodos e propriedades da classe instanciada usando como referencia a classe pai.
         * Isso não pode acontecer por que o metodo no tipo de referencia não existe, então por mais que em "tomato" tenha, ele não pode ser acessado,
         * ou seja, para o metodo ser acessivel por product2, ele precisa existir na classe product2
         */
        Product product2 = new Tomato("americano", 24);
        System.out.println(product2.getName());
        System.out.println(product2.calcTax());

    }
}
