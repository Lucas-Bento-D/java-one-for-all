package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(0);
//        numbers.add(4);
//        numbers.add(3);
//        /**
//         * regra binary search:
//         * (-(ponto de inserção)-1)
//         *  index 0,1,2,3
//         *  value 0,2,3,4
//         */
//
//        Collections.sort(numbers); // Lista precisa est[a ordenada antes de executar o binary search
//        System.out.println(Collections.binarySearch(numbers, 2));

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5, "Berserk", 19.9));
        mangas.add(new Manga(4, "Hellsing", 9.6));
        mangas.add(new Manga(3, "Attack on Titan", 3.2));
        mangas.add(new Manga(2, "Pokemon", 11.20));
        mangas.add(new Manga(1, "Dragon ball Z", 2.99));

        Collections.sort(mangas);
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4, "Hellsing", 9.6);
        //binarySearch(lista, oque busca)
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

    }
}
