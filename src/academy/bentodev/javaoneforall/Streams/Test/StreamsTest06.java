package academy.bentodev.javaoneforall.Streams.Test;

import academy.bentodev.javaoneforall.Streams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest06 {
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
//        Stream<LightNovel> lN = lightNovels.stream()
//        List<String> lnBiggerThan8 = lightNovels.stream()
//                .filter(lightNovel -> lightNovel.getPrice() > 8)
//                .map(lightNovel -> lightNovel.getTitle())
//                .collect(Collectors.toList());
//        System.out.println(lnBiggerThan8);

        //funcoes de match em stream
        System.out.println(lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() > 0));


        // Filtra lightnovel que tem o preco maior que 3, acha qualquer um(metodo findAny), se tiver(metodo ifPresent)
        // faz um sout no console
        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        // Filtra lightnovel que tem o preco maior que 3, acha a primeira ocorrencia(metodo findFirst), se tiver(metodo ifPresent)
        // faz um sout no console
        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findFirst()
                .ifPresent(System.out::println);

        // Filtra lightnovel que tem o preco maior que 3, acha a primeira ocorrencia(metodo findFirst),
        // ordena por preco, se tiver(metodo ifPresent)
        // faz um sout no console
        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
