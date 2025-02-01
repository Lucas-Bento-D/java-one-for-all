package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Manga;
import academy.bentodev.javaoneforall.Collections.Domain.Smartphone;

import java.util.*;

class SmartphoneBrandComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        // para compara double, temos que pegar o metodo compare do wrapper Double e enviar como parametro o double 1 e double 2
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
public class NavegableSetTest01 {
    public static void main(String[] args) {
        /**
         * NavigableSet implementa alguns metodos de comparação de itens em uma lista, podemos até passar uma classe que implementa comparator como parametro no
         * TreeSet, essa classe de parametro contem um método para comparar itens daquela lista.
         * NavigateSet também ignora elementos repetidos, ou seja, caso adicionarmos um elemento igual, ele simplesmente não adicionará.
         * Nesse caso ele irá ignorar todos com o nome igual, pois o compareTo de Mangá está levando o nome em consideração.
         * É importante que no uso do TreeSet, nós tenhamos implementado corretamente se quisermos que seja ordenado de uma maneira especifica, caso contrario
         * a ordenação será em ordem alfabetica
         */
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone1 = new Smartphone("123", "Nokia");
        Smartphone smartphone2 = new Smartphone("124", "samsung");
        Smartphone smartphone3 = new Smartphone("125", "Apple");
        set.add(smartphone1);
        set.add(smartphone2);
        set.add(smartphone3);
        for (Smartphone smartphone: set){
            System.out.println(smartphone);
        }

        /**
         * Se imprimimos os mangas, ele estará em ordem alfabetica pelos nomes, isso acontece pois a classe Manga
         * tem um compareTo comparando nomes
         */
        // Adicionando o MangaPriceComparator como parametro, o java comecara a utilizar o metodo compare dele para comparar os itens, esse metodo nos mudamos ele
        // por meio de poliformismo onde comparamos o preco dos itens
        // como a medida de comparacao agora e o preco, o TreeSet nao mostrara itens de preco igual
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5, "Berserk", 19.9, 0));
        mangas.add(new Manga(4, "Hellsing", 9.6, 5));
        mangas.add(new Manga(3, "Attack on Titan", 3.2, 12));
        mangas.add(new Manga(2, "Pokemon", 11.20, 3));
        mangas.add(new Manga(1, "Dragon ball Z", 2.99, 7));
        mangas.add(new Manga(10, "Aragon", 2.99, 7));


        for (Manga manga: mangas){
            System.out.println(manga);
        }
        System.out.println("-------------------------------------");
        /**
         * Outros metodos do NavigableSet
         * descendingSet() - Metodo que ordena a Colecao de baixo pra cima
         * lower - traz o menor da colecao antes do parametro
         * floor - traz o menor ou igual da colecao antes do parametro
         * higher - traz o maior apos o parametro
         * ceiling - traz o maior ou igual da colecao apos o parametro
         */


        Manga yuyu = new Manga(10, "Yuyu Hakusho", 3.2, 7);

        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size()); // retorna o tamanho da colecao
        System.out.println(mangas.pollFirst()); // elimina o primeiro item da colecao
        System.out.println(mangas.size());

        System.out.println("------------------");
        for (Manga manga: mangas.descendingSet()){
            System.out.println(manga);
        }

    }
}
