package academy.bentodev.javaoneforall.generics.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of( new Cat(), new Cat());

        /**
         * Quando trabalhamos com colecoes, temos um cenario diferente, onde mesmo com a tipagem abstrata Animal, nao podemos passar
         * nem uma lista de Dog e nem de Cat.
         * Isso acontece pois no momento da escrita do codigo(erro de compilacao), o Java nao sabe qual tipo de lista estamos usando de fato,
         * o nome desse erro é Type erasure.
         */
//        consultationPrint(dogs);
//        consultationPrint(cats);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        consultationPrint(animals);
    }

    /**
     * Passando no parametro "? super {nome da classe}" nós podemos agora fazer adições e leituras na coleção, mas na chamada
     * da função, precisa ser uma colecao super da classe, caso contrario, teremos erros.
     * Agora, podemos realizar leitura e escrita no metodo, a diferenca aqui é que temos que fazer uma lista de Animal especificamente.
     * Aqui aplicamos o polimorfismo usando a regra "é um", ou seja, cat é um animal, dog é um animal, então eles podem estar na
     * coleção animals e podem ser adicionados dentro do metodo consultationPrint
     * @param animals
     */
    private static void consultationPrint(List<? super Animal> animals){
        Animal cat = new Cat();
        Animal dog = new Dog();

        animals.add(cat);
        animals.add(dog);

        /**
         * Para percorrermos a coleção respeitando o tipo do que recebemos, precisamos subir classes alen de Animal(por isso "super Animal")
         * e com isso acabaremos chegando na classe pai de tudo que é Object, na execução desse for, podemos fazer um if para checar a instancia
         * da classe recebida, se for a desejada, executamos uma função executando casting para executar algum metodo especifico de leitura por exemplo
         * de alguma classe desejada.
         */
        for (Object o: animals){

            if(o instanceof Dog) ((Dog) o).consultation();
            if(o instanceof Cat) ((Cat) o).consultation();
        }
    }
//    /**
//     * Um jeito de lidar com a passage das colecoes como parametro é adicionando na tipagem  "? extends {nome da classe extendida}" ou adicionando a tipagem real(nesse caso, Dog ou Cat)
//     * Mas isso tem seus ônus, um deles é que não podemos mais adicionar itens a coleções animals dentro da função, trazendo a ideia
//     * de apenas leitura do dado.
//     * @param animals
//     */
//    private static void consultationPrint(List<? extends Animal> animals){
//        for (Animal animal: animals){
//            animal.consultation();
//        }
//    }
//    private static void consultationPrint(List<Animal> animals){
//        for (Animal animal: animals){
//            animal.consultation();
//        }
//        /**
//         * Por outro lado, podemos adicionar itens na colecao dentro do metodo
//         */
//        animals.add(new Dog());
//    }
}
