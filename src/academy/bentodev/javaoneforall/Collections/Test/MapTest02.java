package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Consumer;
import academy.bentodev.javaoneforall.Collections.Domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Naruto");
        Consumer consumer2 = new Consumer("Goku");
        System.out.println(consumer1);

        Manga manga1 = new Manga(5, "Berserk", 19.9, 0);
        Manga manga2 = new Manga(4, "Hellsing", 9.6, 5);
        Manga manga3 = new Manga(3, "Attack on Titan", 3.2, 12);
        Manga manga4 = new Manga(2, "Pokemon", 11.20, 3);
        Manga manga5 = new Manga(1, "Dragon ball Z", 2.99, 7);

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, manga4);
        consumerMangaMap.put(consumer2, manga3);

        for (Consumer key: consumerMangaMap.keySet()){
            System.out.println("Consumidor: " + key.getName());
            System.out.println("manga comprado: " + consumerMangaMap.get(key).getName());
        }

        for (Map.Entry<Consumer, Manga> entry : consumerMangaMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
