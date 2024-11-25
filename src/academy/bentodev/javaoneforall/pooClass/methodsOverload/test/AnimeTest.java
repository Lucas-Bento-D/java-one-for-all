package academy.bentodev.javaoneforall.pooClass.methodsOverload.test;

import academy.bentodev.javaoneforall.pooClass.methodsOverload.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12, "ação");
        anime.print();
    }
}
