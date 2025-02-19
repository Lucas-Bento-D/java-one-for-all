package academy.bentodev.javaoneforall.Lambda.Test;

import academy.bentodev.javaoneforall.Lambda.Domain.Anime;
import academy.bentodev.javaoneforall.Lambda.Service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(List.of("Rimaru", "Veldora", "Hikimaru"));
        nameList.sort(String::compareTo);
        System.out.println(nameList);

        Function<String, Integer> stringToInteger = Integer::parseInt;
        System.out.println(stringToInteger.apply("19"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(nameList, "Rimaru"));
    }
}
