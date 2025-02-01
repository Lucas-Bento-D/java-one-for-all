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

public class NavegableSetTest01 {
    public static void main(String[] args) {
        /**
         * NavigableSet implementa alguns metodos de comparação de itens em uma lista, podemos até passar uma classe que implementa comparator como parametro no
         * TreeSet, essa classe de parametro contem um método para comparar itens daquela lista.
         * NavigateSet também ignora elementos repetidos, ou seja, caso adicionarmos um elemento igual, ele simplesmente não adicionará.
         * Nesse caso ele irá ignorar todos com o nome igual, pois o compareTo de Mangá está levando o nome em consideração
         */
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone1 = new Smartphone("123", "Nokia");
        set.add(smartphone1);


        /**
         * Se imprimimos os mangas, ele estará em ordem alfabetica pelos nomes, isso acontece pois a classe Manga
         * tem um compareTo comparando nomes
         */
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5, "Berserk", 19.9, 0));
        mangas.add(new Manga(4, "Hellsing", 9.6, 5));
        mangas.add(new Manga(3, "Attack on Titan", 3.2, 12));
        mangas.add(new Manga(2, "Pokemon", 11.20, 3));
        mangas.add(new Manga(1, "Dragon ball Z", 2.99, 7));
        mangas.add(new Manga(10, "Aragon", 2.99, 7));

        for (Manga manga: mangas){
            System.out.println(manga);
        }

    }
}
