package academy.bentodev.javaoneforall.Collections.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing");
        mangas.add("Attack on Titan");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");

        Collections.sort(mangas);

        List<Double> cashs = new ArrayList<>();
        cashs.add(10.00);
        cashs.add(51.12);
        cashs.add(24.30);
        cashs.add(41.76);


        for (String manga: mangas){
            System.out.println(manga);
        }
        Collections.sort(cashs);
        for (double cash: cashs){
            System.out.println(cash);
        }

    }
}
