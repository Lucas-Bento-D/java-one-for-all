package academy.bentodev.javaoneforall.pooClass.inicializationBlocks.test;

import academy.bentodev.javaoneforall.pooClass.inicializationBlocks.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println("\n" + anime.getEpisodes());
    }

}
