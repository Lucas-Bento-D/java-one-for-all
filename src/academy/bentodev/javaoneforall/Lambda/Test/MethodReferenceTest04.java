package academy.bentodev.javaoneforall.Lambda.Test;

import academy.bentodev.javaoneforall.Lambda.Domain.Anime;
import academy.bentodev.javaoneforall.Lambda.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animes = new ArrayList<>(
                List.of(
                        new Anime("One Piece", 900),
                        new Anime("Berserk", 43),
                        new Anime("Naruto", 500)
                )
        );
        animes.sort(animeComparators::compareByEpisodesNonStatic);
    }
}
