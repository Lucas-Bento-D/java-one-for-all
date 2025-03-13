package academy.bentodev.javaoneforall.Streams.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<List<String>> multiDimensionArr = new ArrayList<>();
        List<String> graphicDesigners = List.of("person 1", "person 2", "person 3");
        List<String> developers = List.of("dev 1", "dev 2", "dev 3");
        List<String> students = List.of("students 1", "students 2", "students 3");
        multiDimensionArr.add(graphicDesigners);
        multiDimensionArr.add(developers);
        multiDimensionArr.add(students);
//        System.out.println(multiDimensionArr);

        // Sem Streams
        for (List<String> Arr: multiDimensionArr){
            for (String string: Arr){
                System.out.println(string);
            }
        }
        System.out.println("------------------------");

        // Com Streams
        Stream<List<String>> stream = multiDimensionArr.stream();

        /**
         * flatMap() é usado quando você deseja tirar um atributo de algum lugar
         */
        stream.flatMap(a -> a.stream())
                .forEach(a -> System.out.println(a));
    }
}
