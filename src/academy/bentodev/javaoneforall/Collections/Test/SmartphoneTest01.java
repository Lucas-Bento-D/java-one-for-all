package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        // smartphones.clear(); -> exclui todos os itens da lista
        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone.toString());
        }

        Smartphone s4= new Smartphone("22222", "Pixels");

        /**
         * É importante citar o uso do contains que basicamente busca na lista pelo objeto adicionado por parametro.
         * Um outro ponto importante a ser dito sobre o contains é que ele aciona o método equals que na classe smartphone está
         * sobreescrito(paradigma do polimorfismo), então temos as validações comuns que adicionamos no equals + a validação
         * se o serialNumber é igual, ou seja, caso tenhamos um serialNumber igual, o parametro brand não vai importar nesse caso
         * visto que só adicionamos verificação para o serial.
         */

        System.out.println(smartphones.contains(s4));

        int indexSmartphone4 = smartphones.indexOf(s4); // Traz o index do item enviado no parametro ou -1 caso nao encontrar o item
        System.out.println(indexSmartphone4);
    }
}
