package academy.bentodev.javaoneforall.Streams.Test;

import academy.bentodev.javaoneforall.Streams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
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

    /**
     * Quando se trabalha com stream, voce trabalha com tempo e nao espaco, ou seja, a stream é um dado momentaneo
     * e não alocado. Sabendo disso, quando um stream é fechado, não se pode trabalhar novamente com ele, como se
     * tivesse perdido o tempo daquele dado. Caso for necessario o uso do stream novamente, vai ser preciso abrir um
     * novo stream
     * @param args
     */
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
//                .forEach(lightNovel -> System.out.println(lightNovel));
        long count = stream.filter( lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        // Novo Stream
        long count2 = lightNovels.stream()
                .distinct()
                .filter( lightNovel -> lightNovel.getPrice() <= 4)
                .count();
        System.out.println(count);
        System.out.println(count2);
    }
}
