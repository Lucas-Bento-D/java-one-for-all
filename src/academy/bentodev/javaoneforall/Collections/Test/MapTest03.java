package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Consumer;
import academy.bentodev.javaoneforall.Collections.Domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Naruto");
        Consumer consumer2 = new Consumer("Goku");
        System.out.println(consumer1);

        Manga manga1 = new Manga(5, "Berserk", 19.9, 0);
        Manga manga2 = new Manga(4, "Hellsing", 9.6, 5);
        Manga manga3 = new Manga(3, "Attack on Titan", 3.2, 12);
        Manga manga4 = new Manga(2, "Pokemon", 11.20, 3);
        Manga manga5 = new Manga(1, "Dragon ball Z", 2.99, 7);

        List<Manga> mangaConsumerList = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumer2List = List.of(manga1, manga4, manga5);
        Map<Consumer, List<Manga>> consumerMangasMap = new HashMap<>(); // agora o Map espera como chave o Consumer e uma Lista de mangas ao inves de um manga

        consumerMangasMap.put(consumer1, mangaConsumerList);
        consumerMangasMap.put(consumer2, mangaConsumer2List);

        for (Map.Entry<Consumer, List<Manga>> entry : consumerMangasMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
