package academy.bentodev.javaoneforall.Streams.Test;

import academy.bentodev.javaoneforall.Streams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsTest07 {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4);
        // metodo reduce retorna um optional pois o array pode estar vazio
                numberList.stream().reduce((x, y) -> x+y)
                .ifPresent(System.out::println);
        // adicionando o parametro identificador inicial no reduce,
        // ele muda de option para inteiro, pois eh certo de ter retorno de valor
        Integer reduce = numberList.stream().reduce(0,(x, y) -> x+y);

    }
}
