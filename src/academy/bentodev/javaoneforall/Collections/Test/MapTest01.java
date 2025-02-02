package academy.bentodev.javaoneforall.Collections.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        /**
         * 1ª regra do Map: não pode ter chaves duplicadas, caso repita a mesma chave, ele irá substituir o valor
         */
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2"); // metodo que adiciona caso a chave nao exista
        System.out.println(map);

        for (String key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println("------------------");
        for (String value: map.values()){
            System.out.println(value);
        }

        System.out.println("------------------");
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry);
        }

    }
}
