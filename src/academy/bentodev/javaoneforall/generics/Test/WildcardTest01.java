package academy.bentodev.javaoneforall.generics.Test;

import java.sql.Array;

abstract class Animal{
    public abstract void consultation();
}

class Dog extends Animal{
    @Override
    public void consultation() {
        System.out.println("Consultando Dog.");
    }
}

class Cat extends Animal{
    @Override
    public void consultation() {
        System.out.println("Consultando gato.");
    }
}
public class WildcardTest01 {
    public static void main(String[] args) {
        // Perceba que estamos trabalhando com arrays aqui
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = { new Cat(), new Cat()};

        consultationPrint(dogs);
        consultationPrint(cats);

        /**
         * Nesse exemplo, se for desejado, podemos passar tanto um array de gato, quanto cachorro para a funcao consultationPrint
         * Visto que ambos satisfazem a classe animal
         */
        Animal[] animals = {new Cat(), new Dog()};
        consultationPrint(animals);
    }
    private static void consultationPrint(Animal[] animals){
        for (Animal animal: animals){
            animal.consultation();
        }

        /**
         * Mas nao podemos por exemplo setar que um elemento qualquer do array recebido seja construido um gato ou um cachorro,
         * pois isso gera um store Exception
         */
//        animals[1] = new Cat();
    }
}
