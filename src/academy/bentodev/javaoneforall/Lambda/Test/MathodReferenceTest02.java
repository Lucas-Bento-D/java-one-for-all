package academy.bentodev.javaoneforall.Lambda.Test;

import academy.bentodev.javaoneforall.Lambda.Domain.Anime;
import academy.bentodev.javaoneforall.Lambda.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MathodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animes = new ArrayList<>(
                List.of(
                        new Anime("One Piece", 900),
                        new Anime("Berserk", 43),
                        new Anime("Naruto", 500)
                )
        );
        /**
         * Para fazer um method reference em metodos n'ao estaticos, é muito parecido com o jeito que fazemos
         * para métodos estaticos, com a diferença que no exemplo abaixo, nós estamos chamando a metodo direto do objeto
         * animeComparators e não da classe Collections.
         */
        animes.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animes);
    }
}
