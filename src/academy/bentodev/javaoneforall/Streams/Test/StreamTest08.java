package academy.bentodev.javaoneforall.Streams.Test;

import academy.bentodev.javaoneforall.Streams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>( List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Fullmetal Alchimist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        lightNovels.stream()
                .map(lightNovel -> lightNovel.getPrice())
                .filter(lnPrice -> lnPrice > 3)
                .reduce((x, y) -> x + y)
                .ifPresent(System.out::println);
    }
}
