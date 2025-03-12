package academy.bentodev.javaoneforall.Streams.Test;

import academy.bentodev.javaoneforall.Streams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 1 - Order LightNovel by title
 * 2 - Retrieve the first 3 light novels with price less than 4
 */
public class StreamsTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> NovelsWithPriceLessThan4 = new ArrayList<>();
        for ( LightNovel lightNovel : lightNovels){

            if(lightNovel.getPrice() <= 4){
                NovelsWithPriceLessThan4.add(lightNovel.getTitle());
            }
            if(NovelsWithPriceLessThan4.size() >=3) break;
        }
        System.out.println(NovelsWithPriceLessThan4);
        System.out.println(lightNovels);
    }
}
