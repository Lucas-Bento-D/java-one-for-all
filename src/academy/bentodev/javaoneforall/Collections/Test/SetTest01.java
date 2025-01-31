package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        //Coleção que permite apenas elementos unicos
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5, "Berserk", 19.9, 0));
        mangas.add(new Manga(4, "Hellsing", 9.6, 5));
        mangas.add(new Manga(3, "Attack on Titan", 3.2, 12));
        mangas.add(new Manga(2, "Pokemon", 11.20, 3));
        mangas.add(new Manga(1, "Dragon ball Z", 2.99, 7));

        // antes de inserir, o java ira usar o metodo equals para saber se esse item é duplicado ou não, se for, ele não adiciona
        mangas.add(new Manga(1, "Dragon ball Z", 2.99, 7));

        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
