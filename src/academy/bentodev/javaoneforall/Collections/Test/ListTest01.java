package academy.bentodev.javaoneforall.Collections.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        /**
         * Para a implementação de List, em tempo de compilação em bitecode, a JVM só entende que a variavel é uma lista
         * pois é isso que importa nesse momento, já no tempo da compilação real do código, o Java força para que
         * o tipo da Lista seja oque está dentro ta tag, ou seja, no bytecode o java entente List e no tempo de compilação real
         * o java força List<E>, sendo esse E um tipo inserido no código.
         */
        List<String> names = new ArrayList<>();
        names.add("Willian");
        names.add("DevDojo");

        for (String name: names){
            System.out.println(name);
        }
        names.add("add novo");
        System.out.println("----------------");
        /**
         * Como estamos trabalhando com Lista(coleção) e não com arrays(sei que parece confuso), não pegamos o tamanho com
         * .length e sim com .size()
         */
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
