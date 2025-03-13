package academy.bentodev.javaoneforall.Streams.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "no", "mi");
        List<String> letters = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letters);
    }
}
