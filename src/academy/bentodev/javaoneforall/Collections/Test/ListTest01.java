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
         * Lembrando que esse tipo <E> precisa ser um Wrapper e nao um tipo primitivo, lembrando que Wrapper de tipos primitivos sao:
         * Byte byteW = 1;
         * Short shortW=1;
         * Integer intW = 1;
         * Long longW = 10L;
         * Float floatW = 10F;
         * Double doubleW = 10D;
         * Character charW = 'W';
         * Boolean booleanW = false;
         */
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("Willian");
        names.add("DevDojo");
        names2.add("Suane");
        names2.add("Academy");
//        names.remove("Willian");

        names.addAll(names2);
        for (String name: names){
            System.out.println(name);
        }
        System.out.println("----------------");
        /**
         * Como estamos trabalhando com Lista(coleção) e não com arrays(sei que parece confuso), não pegamos o tamanho com
         * .length e sim com .size()
         */
        int size = names.size();
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
            names.add("add novo"); // [e uma m[a pr[atica lidar com o tamanho da lista dentro de um for
        }
        System.out.println(names);
    }
}
