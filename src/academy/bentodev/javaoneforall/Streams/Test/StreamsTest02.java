package academy.bentodev.javaoneforall.Streams.Test;

import academy.bentodev.javaoneforall.Streams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchimist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
//        Stream<LightNovel> stream = lightNovels.stream();
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .limit(3)
                .map(lightNovel -> lightNovel.getTitle())
                .collect(Collectors.toList());
        System.out.println(titles);
    }
}
