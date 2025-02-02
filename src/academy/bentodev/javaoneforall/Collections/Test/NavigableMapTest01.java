package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Consumer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {

        Consumer consumer1 = new Consumer("Naruto");
        Consumer consumer2 = new Consumer("Goku");

        NavigableMap<String, Consumer> map = new TreeMap<>();
        map.put("A", consumer1);
        map.put("D", consumer2);
        map.put("B", consumer1);
        map.put("C", consumer2);
        map.put("E", consumer1);

        for (Map.Entry<String, Consumer> entry: map.entrySet() ){
            System.out.println(entry.getKey() + " = " + entry.getValue().getName());
        }

        //alguns metodos baseados na mesma logica do NavigableSet tambem sao incorporados aqui, como o lower, higher, ceiling e floor por exemplo(aqui sao lowerKey, higherKey, ceilingKey e floorKey)
        System.out.println(map.headMap("C")); // retorna todos antes da key de parametro
        // podemos adicionar mais um parametro nesse metodo, caso ele for true, ele inclui a chave inserida no parametro
    }
}
