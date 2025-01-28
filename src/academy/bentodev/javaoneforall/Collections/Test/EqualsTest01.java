package academy.bentodev.javaoneforall.Collections.Test;

import academy.bentodev.javaoneforall.Collections.Domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        // Variaveis que faz a referencia a uma mesma string estao localizadas no pool de strings, logo, name == name2
//        String name = "Monkey D. Luffy"; // pool de string
//        String name2 = "Monkey D. Luffy"; // pool de string
//        System.out.println(name == name2);

//        String name = "Monkey D. Luffy"; // pool de string
//        String name2 = new String("Monkey D. Luffy"); // referencia propria
//        System.out.println(name == name2); // false
//
//        System.out.println(name.equals(name2)); // metodo equals verifica se os valores sao iguais


        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");

        // objetos diferentes
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

//        para referencia ser igual, precisariamos fazer com que nao so o valor de s2 fosse igual ao de s1, mas que s2 recebesse s1

        s2 = s1;
        System.out.println(s1 == s2);

    }
}
