package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMangaTest01 {
    public static void main(String[] args) {
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


    }
}
