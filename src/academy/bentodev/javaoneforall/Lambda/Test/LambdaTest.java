package academy.bentodev.javaoneforall.Lambda.Test;

import java.util.List;
import java.util.function.Consumer;

/**
 * A nivel de explicacao, aqui nos basicamente chamamos a funcao accept da interface costumer para podermos
 * aplicar poliformismo a ela e implementar na chamada da funcao forEach o System.out.println que nao tem retorno,
 * oque satisfaz a o contrato do metodo accept
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> names = List.of("nome", "nome2", "nome3");
        forEach(names, name -> System.out.println(name));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T item: list ){
            consumer.accept(item);
        }
    }
}
